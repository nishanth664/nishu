package com.fb.qa.baseclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fb.qa.pageobject.Loginpageobjects;
import com.fb.qa.utils.commonactions;

public class credentials {
	
	public  WebDriver driver;
	public  Properties properties = new Properties();
	public  Loginpageobjects obj = new Loginpageobjects();
	public commonactions action = new commonactions();
	
	
	

	@BeforeTest
	public void nishanth() throws Exception{
    properties.load(new FileReader(new File ("test.properties")));
	System.setProperty("webdriver.gecko.driver",properties.getProperty("webdriver.gecko.driver"));
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\VENUE11 PRO\\Desktop\\Web Drivers\\chromedriver.exe");
	 driver = new FirefoxDriver();
	System.out.println("webdriver set");
    //properties.getProperty("url");
	driver.get("https://www.facebook.com");
    System.out.println("Browser launched");
    driver.manage().window().maximize();
     Thread.sleep(30);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//    driver.findElement(By.xpath(obj.login_username)).sendKeys(properties.getProperty("username"));
//    driver.findElement(By.xpath(obj.login_password)).sendKeys(properties.getProperty("password"));
//   driver.findElement(By.xpath(obj.login_button)).click();
  // Assert.assertTrue(action.verifyTitle(driver));
	}
	
	@AfterTest
	public void afterMethod() {
		driver.quit();
	}
}
