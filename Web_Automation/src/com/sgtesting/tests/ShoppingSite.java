package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSite {
	public static WebDriver oSite=null;
	public static void main(String[] args) {
		launchSite();
		navigate();
		clickOnDressesOption();
	}

	static void launchSite() {
		try {
			oSite=new ChromeDriver();
		}catch(Exception e) {
			e.printStackTrace();		}
	}
	
	static void navigate() {
		try {
			oSite.get("https://www.berrylush.com/");
		}catch(Exception e) {
			e.printStackTrace();		}
	}
	
	static void clickOnDressesOption() {
		try {
			oSite.findElement(By.linkText("DRESSES")).click();
			Thread.sleep(3000);
			oSite.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div[2]/ul/div[3]/li[1]/form/input[2]")).sendKeys("yellow dresses");
			Thread.sleep(3000);
			oSite.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div[2]/ul/div[3]/li[1]/form/span")).click();
			Thread.sleep(3000);
			oSite.findElement(By.xpath("//*[@id=\"shopify-section-search-template\"]/div/div[4]/div[1]/div[10]/div/a/div/span[1]")).click();
			Thread.sleep(3000);
			oSite.findElement(By.xpath("//*[@id=\"product_form_4579484598337\"]/div[12]/div[1]/span[2]/span")).click();
			Thread.sleep(3000);
			oSite.findElement(By.xpath("//*[@id=\"product_form_4579484598337\"]/div[12]/div[2]/button")).click();
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();		}
	}
}
