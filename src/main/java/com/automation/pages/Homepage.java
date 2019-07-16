package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	static String url ="http://newtours.demoaut.com/";
	
	
	public static void login(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.name("userName")).sendKeys("amy15093");
		driver.findElement(By.name("password")).sendKeys("Amy@15093");
		driver.findElement(By.name("login")).click();
		
	}
	
	
	public static void getUrl(WebDriver driver) {
		
		driver.get(url);
		driver.manage().window().maximize();	
	}
	
}
