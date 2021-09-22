package com.sgtesting.tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTaskDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		importTasks();
	}
	
	static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rushmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try {
			oBrowser.get("http://localhost:82/login.do");
//			oBrowser.get("https://www.berrylush.com/products/dr766yl-berrylush-yellow-floral-print-dress?_pos=39&_sid=39ec424bd&_ss=r");
			Thread.sleep(8000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void importTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()=\"Add New Task\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class=\"item importTasks ellipsis\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String fileName="G:\\EXAMPLE\\Sample.csv";
			copyFile(fileName);
			Thread.sleep(2000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void copyFile(String fileName) 
	{
		StringSelection selection=new StringSelection(fileName);
		Toolkit obj=Toolkit.getDefaultToolkit();
		Clipboard cb=obj.getSystemClipboard();
		cb.setContents(selection, null);
	}

}
