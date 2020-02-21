package com.fb.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fb.qa.baseclass.credentials;
import com.fb.qa.pageobject.Loginpageobjects;
import com.fb.qa.utils.commonactions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpagetest extends credentials {
	
private WebDriver driver;
Loginpageobjects Loginpageobjects = new Loginpageobjects();
public commonactions actions = new commonactions();
private Properties properties = new Properties();

public Loginpagetest() {
	super();
}

@BeforeMethod
public void BeforeMethod() throws Exception{
	nishanth();
}

@Test(priority = 1)
public void nishanth(WebDriver driver,String username ,String password ) {
 actions.click(driver ,By.xpath(Loginpageobjects.login_username));
 actions.sendKeys(driver, By.xpath(Loginpageobjects.login_username),username);
 actions.sendKeys(driver, By.xpath(Loginpageobjects.login_password),password);
 actions.click(driver, By.xpath(Loginpageobjects.login_button));
}

@AfterMethod
public void AfterMethod() {
	driver.quit();
}


//@Test(priority = 0)
//public boolean  pageTitle(){
//String actualtitle 	= Loginpageobjects.getTitle();
//String expectedtitle = "facebook";
// if((actualtitle.contains(expectedtitle))) {
//	 System.out.println(actualtitle);
//	return true; 
// }
// else {
//	 return false;
// }
//	}




/*@Test(priority =1)
public void nishanth(){
 Loginpageobjects.login_username.isDisplayed();
 System.out.println("is displayed ");
	if(Loginpageobjects.login_username()) {
		System.out.print(true);
		return true;
	}
	else {
		return false;
	}
	
	public void login_username() {
		Loginpageobjects.login_username( by, text).click();
	}


}*/

//@Test(priority =2)
//public boolean  ac_img2(){
//  return obj.add_account1();
//}*/
/*@Test(priority =3 )
public void add_account2() {
	 
WebElement frame=	obj.add_account2();
obj.add_account2().click();
driver.switchTo().frame(frame);
System.out.println(frame);

}*/

@AfterMethod
public void after() {
	afterMethod();
}

}
