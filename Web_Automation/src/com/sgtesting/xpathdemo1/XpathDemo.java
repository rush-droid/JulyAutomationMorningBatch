package com.sgtesting.xpathdemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		absoluteXpath();
//		relativeXPathUsingTagNameAlone();
//		relativeXPathUsingTagNameAndIndex();
//		relativeXPathUsingTagNameWithAttributeNameValue();
//		relativeXPathUsingTagNameWithMultipleAttributeNameValues();
//		relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingAndOperator();
//		relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingOrOperator();
//		relativeXPathUsingAttributeNameValueCombination();
//		relativeXPathUsingAttributeValueAlone();
//		relativeXPathUsingTagNameAndAttributeNameAlone();
//		relativeXPathUsingTagNameAndAttributeNameAlone2();
//		relativeXPathUsingTagNameAndAttributeNameAlone3();
//		relativeXPathUsingTagNameAndAttributeNameAlone4();
//		relativeXPathUsingPartialAttributeValue();
//		relativeXPathUsingTextContent();
		relativeXPathUsingPartialTextContent();
	}

	static void launchBrowser()
	{
		try {
//			System.setProperty("webdriver.chrome.driver", "G:\\WelcomeAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try {
			oBrowser.get("G:\\Sample.html");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void absoluteXpath()
	{
		try {
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("demoUser1");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameAlone()
	{
		try {
			oBrowser.findElement(By.xpath("//input")).sendKeys("demoUser1");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	
	static void relativeXPathUsingTagNameAndIndex()
	{
		try {
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Password1");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		try {
			oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameWithMultipleAttributeNameValues()
	{
		try {
			oBrowser.findElement(By.xpath("//input [@value='Submit'] [@class='submit1btn1']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingAndOperator()
	{
		try {
			oBrowser.findElement(By.xpath("//input [@value='Submit' and @class='submit1btn1']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameWithMultipleAttributeNameValuesUsingOrOperator()
	{
		try {
			oBrowser.findElement(By.xpath("//input [@value='Submit' or @class='submit1btn1']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingAttributeNameValueCombination()
	{
		try {
			oBrowser.findElement(By.xpath("//* [@value='Submit']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingAttributeValueAlone()
	{
		try {
			oBrowser.findElement(By.xpath("//* [@value='Submit']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameAndAttributeNameAlone()
	{
		try {
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println(olinks.size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameAndAttributeNameAlone2()
	{
		try {
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println(olinks.size());
			
			for(WebElement links:olinks)
			{
				String name=links.getText();
				System.out.println(name);
				{
					
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameAndAttributeNameAlone3()
	{
		try {
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println(olinks.size());
			
			for(WebElement links:olinks)
			{
				String name=links.getText();
				if(name.endsWith("Institute"))
				{
					links.click();
					break;
				}
			}
			Thread.sleep(3000);
			oBrowser.navigate().back();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTagNameAndAttributeNameAlone4()
	{
		try {
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println(olinks.size());
			
			for(WebElement links:olinks)
			{
				String name=links.getText();
				if(name.startsWith("Sel"))
				{
					links.click();
				}
			}
			Thread.sleep(1000);
			oBrowser.navigate().back();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingPartialAttributeValue()
	{
		try {
//			oBrowser.findElement(By.xpath("//input[contains(@id,'windows')]")).click();
			oBrowser.findElement(By.xpath("//input[starts-with(@id,'rad2')]")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingTextContent()
	{
		try
		{
			String link="Eclipse";
			oBrowser.findElement(By.xpath("//a[text()='"+link+"']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void relativeXPathUsingPartialTextContent()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
