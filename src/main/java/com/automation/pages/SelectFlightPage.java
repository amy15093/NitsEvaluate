package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlightPage {

	public static void selectflight(WebDriver driver) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10' ]")).click();;
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30' ]")).click();
		driver.findElement(By.name("reserveFlights")).click();	
		Thread.sleep(7000);
		
		try {
		VerficationSucessful.takeSnapShot(driver, "D://test.png") ; 
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}
