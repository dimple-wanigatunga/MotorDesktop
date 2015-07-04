package com.cgu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.GlobalConstants;
import utils.SeleniumWrapper;

public class PrivateComprehensive {
	
	public static WebDriver driver;
	
	 @Test(priority=0) 
	 	public static void clickTypeOfInsurance(){
		 boolean  expected = true;
		SeleniumWrapper.click(driver, GlobalConstants.TYPE_OF_INSURANCE);
		//boolean actual = SeleniumWrapper.isSelected(driver, GlobalConstants.TYPE_OF_INSURANCE);
		//Assert.assertEquals(actual, expected);
	}

}
