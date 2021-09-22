package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
//	public static void main(String[] args) {
//		launchBrowser();
//		navigate();
//		login();
//		minimizeFlyOutWindow();
//		createUser();
//		deleteUser();
//		logout();
////		navigate2();
//		closeApplication();
//	}
	
	public static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rushmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try {
			oBrowser.get("http://localhost:82/login.do");
//			oBrowser.get("https://www.berrylush.com/products/dr766yl-berrylush-yellow-floral-print-dress?_pos=39&_sid=39ec424bd&_ss=r");
			Thread.sleep(8000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void minimizeFlyOutWindow()
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
	
	public static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=oBrowser.switchTo().alert();
			String content=obj.getText();
			System.out.println(content);
			obj.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate2()
	{
		try {
//			oBrowser.get("https://www.youtube.com/");
//			oBrowser.get("https://www.myntra.com/");
			oBrowser.get("https://www.ajio.com/");
			Thread.sleep(4000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void closeApplication()
	{
		try {
			oBrowser.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
