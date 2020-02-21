package com.fb.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonactions {
	public WebDriver driver;
	public int  waitInSeconds = 100;
	
	
	public void sendKeys(WebDriver driver, By by, String text) {
		waitForElementToLoad(driver, by);
		driver.findElement(by).sendKeys(text);
	}

	public void waitForElementToLoad(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, waitInSeconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void click(WebDriver driver, By by) {
		waitForElementToLoad(driver, by);
		driver.findElement(by).click();
		waitForPageLoad(driver);
	}
	public void waitForPageLoad(WebDriver driver) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitInSeconds);
			wait.until(expectation);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}
		 public boolean verifyTitle(WebDriver driver) {
		    	
		       String actualTitle = driver.getTitle();
		       String expectedTitle = "Facebook – log in or sign up";     	
		    	if(actualTitle.contains(expectedTitle)) {
		    		return true;
		    	}
		    	else 
		    		return false;
		    	   	
		    }
		   
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
