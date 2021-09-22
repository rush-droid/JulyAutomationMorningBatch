package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FireFoxProfilesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		
	}
	
	static void launchBrowser()
	{
		try
		{
			System.getProperty("webdriver.gecko.driver", "G:\\WelcomeAutomation\\Automation\\Web_Automation\\Library\\Drivers\\geckodriver.exe");
			ProfilesIni profileini=new ProfilesIni();
			FirefoxProfile ffprofile=profileini.getProfile("sgtesting");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(options);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
