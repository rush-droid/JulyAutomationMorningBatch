package com.sgtesting.xpathdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAccessDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser() ;
		navigate();
//		enterSalaryForSachinTendulkar();
//		selectCityForSachinTendulkar();
//		makeTheStatusAsActiveForIndianFreedomFighter();
//		fromRahulDravidFor2ndSecondEnterSalary();
//		fromSachinTendularPrevious3rdRecordMakeStatusAsActive();
//		getTableAttributeValue();
		basedOnParentTagSelectCheckBoxInSecondRow();
	}

	static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "G:\\WelcomeAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate() {

		try {
			oBrowser.get("G:\\WebTableHTML.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void enterSalaryForSachinTendulkar() {
		try {
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void selectCityForSachinTendulkar() {
		try {
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[2]/select"));
			Select oSelect=new Select(oEle);
//			oSelect.selectByIndex(3);
			oSelect.selectByValue("mh");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void makeTheStatusAsActiveForIndianFreedomFighter()
	{
		try {
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td/input")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void fromRahulDravidFor2ndSecondEnterSalary()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/following::tr[1]/td[6]/input")).sendKeys("10000");
//		//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input;
	}
	
	static void fromSachinTendularPrevious3rdRecordMakeStatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[3]/td[1]/input")).click();
	}
	
	static void getTableAttributeValue()
	{
		String s=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println(s);
	}
	
	static void basedOnParentTagSelectCheckBoxInSecondRow()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[3]/td[1]/input")).click();
	}
}
