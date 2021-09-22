package com.sgtesting.assignments;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiRelectionTestRunnerDemo {

	public static void main(String[] args) {
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			fin=new FileInputStream(".\\DataFiles\\data1_runner.xlsx");
			wb=new XSSFWorkbook(fin);
			int sc=wb.getNumberOfSheets();
			for(int s=0;s<sc;s++)
			{
				String sname=wb.getSheetName(s);
				sh=wb.getSheet(sname);
				int rc=sh.getPhysicalNumberOfRows();
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();
					cell=row.getCell(1);
					String pkgClassName=cell.getStringCellValue();
					
					System.out.println(methodname+ "  ---->  "+pkgClassName);
					
					Class cls=Class.forName(pkgClassName);
					Object obj=cls.newInstance();
					 
					Method meth=obj.getClass().getMethod(methodname, null); meth.invoke(obj, null);	 
				}
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}


	

}
