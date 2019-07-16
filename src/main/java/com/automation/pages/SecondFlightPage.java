package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondFlightPage {
	
	public static void flight(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("tripType")).click();
		Select dropdown= new Select(driver.findElement(By.name("passCount")));
		dropdown.selectByValue("2");
		
		dropdown= new Select(driver.findElement(By.name("fromPort")));
		dropdown.selectByValue("London");
		
		dropdown= new Select(driver.findElement(By.name("fromMonth")));
		dropdown.selectByValue("4");
		
		dropdown=new Select(driver.findElement(By.name("fromDay")));
		dropdown.selectByValue("5");
		
		dropdown= new Select(driver.findElement(By.name("fromPort")));
		dropdown.selectByValue("New York");
		
		dropdown= new Select(driver.findElement(By.name("toMonth")));
		dropdown.selectByValue("4");
		
		dropdown= new Select(driver.findElement(By.name("toDay")));
		dropdown.selectByValue("9");
		
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		dropdown=new Select(driver.findElement(By.name("airline")));
		dropdown.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();	

}
}
