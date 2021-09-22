package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		displayTitle();
//		displayURL();
//		displayLinksCount();
//		enterTextInTextField();
//		enterTextInTextField1();
		selectItemFromDropDown();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\WelcomeAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("C:\\Users\\rushmi\\Downloads\\javascriptexecutor_20th_sept_2021\\JavaScriptExecutor_20th_Sept_2021\\Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void displayTitle()
	{
		try {
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String title=(String) js.executeScript("var kk=document.title;return kk;");
			System.out.println(title);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void displayURL()
	{ 
		try {
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String url=(String) js.executeScript("var k=document.URL;return k;");
			System.out.println(url);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
	static void displayLinksCount()
	{
		try {
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			long lcount=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
			System.out.println(lcount);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	static void enterTextInTextField()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('uid1user1name1').value='DemoUser';");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void enterTextInTextField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
			js.executeScript("arguments[0].value='DemoUser1'",oEle);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void selectItemFromDropDown()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String str="var items=document.getElementById('tools');";
			str+="for(var i=0;i<items.length;i++)";
			str+="{";
			str+="if(items.options[i].text='Selenium WebDriver')";
			str+="{";
			str+="items.options[i].selected='1';";
			str+="}";
			str+="}";
			js.executeScript(str);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
