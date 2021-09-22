package com.sgtesting.pomdemo.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePom oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "G:\\WelcomeAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePom(oBrowser);
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
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(8000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
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
			oPage.getFlyOutWin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oPage.getUserIcon().click();
			oPage.getAddUser().click();
			oPage.getFirstName().sendKeys("demo");
			oPage.getLastName().sendKeys("User1");
			oPage.getEmail().sendKeys("demo@gmail.com");
			oPage.getUserName().sendKeys("demoUser1");
			oPage.getUserPassWord().sendKeys("Welcome1");
			oPage.getUserPassWordCopy().sendKeys("Welcome1");
			oPage.getUserCommitBtn().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oPage.getSecondTableContainer().click();
			oPage.getFirstName().clear();
			oPage.getFirstName().sendKeys("demooo");
			oPage.getLastName().clear();
			oPage.getLastName().sendKeys("User11");
			oPage.getUserCommitBtn().click();
			Thread.sleep(8000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oPage.getSecondTableContainer().click();
			Thread.sleep(2000);
			oPage.getUserDeleteBtn().click();
			Thread.sleep(2000);
			Alert obj=oBrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
