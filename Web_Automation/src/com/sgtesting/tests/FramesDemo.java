package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		identifyElements();

	}
	
	static void launchBrowser()
	{
		try
		{
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
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void identifyElements() {
		try
		{
			oBrowser.switchTo().frame("packageListFrame");
			oBrowser.findElement(By.xpath("//a[@target=\"packageFrame\" and text()=\"org.openqa.selenium\"]")).click();
			Thread.sleep(4000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(3000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[text()=\"WebDriver\"]")).click();
			Thread.sleep(3000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
