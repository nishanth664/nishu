package com.fb.qa.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.baseclass.credentials;
import com.fb.qa.test.Loginpagetest;

public class Loginpageobjects {
	
	
private WebDriver driver;

@FindBy(xpath = "//input[@type = 'email']")
WebElement login_username ;


@FindBy(xpath = "//input[@type = 'password' and @ name ='pass']")
WebElement login_password ;

@FindBy(xpath = "//button[@type ='submit' and @ class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")
WebElement login_button ;

@FindBy(xpath = "//img[@class = '_s0 _4ooo _1x2_ _1ve7 _1gax img']")
WebElement fb_image ;

@FindBy(xpath = "//i[contains(@class, 'fb_logo img sp_FhJGyt3JAYO_1_5x sx_831298')]")
WebElement fb_logo;

@FindBy(xpath = "//i[@class = 'img sp_ZwCpbVw2OOJ_1_5x sx_7252c6']")
WebElement add_account;


 public void Loginpageobject(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }



  public String getTitle() {
     return driver.getTitle();
  }

  
  public WebElement Login_username() {
		this.login_username.clear();
		return Login_username();
	}
  

   public WebElement  Login_password(){
	 this.login_password.clear();
	  return Login_password();
  }

   public WebElement Login_button(){
	  this.login_button.isDisplayed();
	  return Login_button();
  }

   public WebElement Check_logo(){
	   fb_logo.isDisplayed();
	   return Check_logo();
  } 
   
   public WebElement Profile_image() {
	   fb_image.isDisplayed();
	   return Profile_image();   
  }
   
   public WebElement Add_account() {
	   add_account.click();
	   return Add_account();
   }
   
   
   
   
   
   
   
   
   
   
   
   
}
