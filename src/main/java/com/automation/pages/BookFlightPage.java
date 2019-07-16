package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlightPage {

	public static void bookaflight(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("passFirst0")).sendKeys("Nitish");
		driver.findElement(By.name("passLast0")).sendKeys("Kumar");
		Select dropdown=new Select(driver.findElement(By.name("pass.0.meal")));
		dropdown.selectByValue("HNML");
		driver.findElement(By.name("passFirst1")).sendKeys("Amrita");
		driver.findElement(By.name("passLast1")).sendKeys("Rathore");
		
		dropdown=new Select(driver.findElement(By.name("pass.1.meal")));
		dropdown.selectByValue("KSML");
		
		dropdown=new Select(driver.findElement(By.name("creditCard")));
		dropdown.selectByValue("BA");
		
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		
		dropdown=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		dropdown.selectByIndex(04);
		dropdown=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		dropdown.selectByValue("2009");
		driver.findElement(By.name("cc_frst_name")).sendKeys("Amrita");
		driver.findElement(By.name("cc_last_name")).sendKeys("Kumari");
		
		driver.findElement(By.name("billAddress1")).sendKeys("ABDCEghfjhsjkednfm, ,sdm");
		driver.findElement(By.name("billCity")).sendKeys("Bangalore");
		driver.findElement(By.name("ticketLess")).click();
		driver.findElement(By.name("buyFlights")).click();
	}
}
