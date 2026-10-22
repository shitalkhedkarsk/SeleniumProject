package com.testing.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart webite opened successfully.");
	}
	
	@AfterMethod
	public void tearDown()
	{
		if(driver != null)
		{
			driver.quit();
			System.out.println("Browser closed successfully.");
		}
	}
	
	

}
