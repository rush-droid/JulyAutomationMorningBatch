package com.sgtesting.tests;

public class RunAutoITFileDemo {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("G:\\EXAMPLE\\Test2.exe");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
