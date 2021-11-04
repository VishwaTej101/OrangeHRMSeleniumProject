package com.e_bankingAuto.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public String username = "Admin";
	public String password = "admin123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty
		("webdriver.chrome.driver", "C:\\Users\\viswa\\eclipse-workspace\\e-BankingAutomationMiniProject_V1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
