package com.fb.qa.test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.security.Credential;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.fb.qa.baseclass.credentials;
import com.fb.qa.pageobject.Loginpageobjects;
import com.fb.qa.utils.commonactions;



public class loginpagetesting extends credentials {

	credentials cred = new credentials();
	Loginpageobjects loginpageobjects = new Loginpageobjects();
	commonactions actions = new commonactions();
	Properties prop = new Properties();
	
	
	  public void setup() throws Exception {
          cred.nishanth();
         
      }

	
	
	@Test(priority = 1)
	public boolean Gettitle() {
		  System.out.println("driver=" + driver); 
        String actualtitle = driver.getTitle();
		String expectedTitle = "facebook_ login";
		if(actualtitle.contains(expectedTitle)){
			System.out.println("title currect ");
			return true;
		}
		else {
			System.out.println("title wrong ");
			return false;
		}
	}

	@Test(priority =2 )
  public void  Login_username() {
    WebElement  object = loginpageobjects.Login_username();
	object.isDisplayed();
	System.out.println("username is displayed");
	object.isSelected();
    object.click();
    object.sendKeys(prop.getProperty("username"));
    }
	
	@Test(priority =3)
  public void   Login_passwod() {
    WebElement  object  = loginpageobjects.Login_password();
	object.click();
	object.sendKeys(prop.getProperty("username"));
    }
	
	@Test(priority =4 )
  public void Login_button() {
    WebElement  object  = loginpageobjects.Login_button();
    object.isDisplayed();
	object.click();
    }
	
	@Test(priority = 5)
  public void Check_logo() {
    WebElement object = loginpageobjects.Check_logo();
    object.click();
	}
	
}
