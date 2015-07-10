package com.cgu.test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.GlobalConstants;
import utils.SeleniumWrapper;

public class TPFT_PolicyType {	
	
	public static  WebDriver driver;

@BeforeTest
 public void ClearCache(){
	 driver = SeleniumWrapper.getInstance(GlobalConstants.CHROME);
	 driver.manage().deleteAllCookies();
	Set<Cookie> set = driver.manage().getCookies();
	if( set.size()==0){
		System.out.println("Cache cleared");
	}
 }

@Test(priority=0) 
	public  void LoadMainPage(){
		 String BaseURL = GlobalConstants.BASEURL;
		 SeleniumWrapper.launchURL(driver, BaseURL);
		}


@Test(priority=1)
public void verifyPageTitle( ){
	 String expected =GlobalConstants.EXP_LAND_TITLE;
	 System.out.println(SeleniumWrapper.getPageTitle(driver));
	 String  actual = SeleniumWrapper.getPageTitle(driver);	 
	 Assert.assertEquals(actual, expected);
}

@Test(priority=2)
public void clickLinkMotorInsurance() {
	SeleniumWrapper.click(driver, GlobalConstants.MOTOR_INSURANCE_LINK);
}

@Test(priority=3) 
public  void clickTypeOfInsurance(){
boolean  expected = true;
SeleniumWrapper.click(driver, GlobalConstants.TYPE_OF_INSURANCE);
boolean actual = SeleniumWrapper.radioButtonChecked(driver, GlobalConstants.TYPE_OF_INSURANCE);
Assert.assertEquals(actual, expected);
}

@Test(priority=4) 
public  void clickLinkComprehensive(){
	 SeleniumWrapper.click(driver, GlobalConstants.TPFT);
	 
}


}
