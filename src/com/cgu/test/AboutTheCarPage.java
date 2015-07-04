package com.cgu.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.GlobalConstants;
import utils.SeleniumWrapper;

public class AboutTheCarPage {
	
	WebDriver driver;
	
	@Test
	public void searchCarByRego(){
		SeleniumWrapper.waitForElementPresent(driver, GlobalConstants.ABOUT_THE_CAR_BUTTON);
		SeleniumWrapper.click(driver, GlobalConstants.ABOUT_THE_CAR_BUTTON);
		
	}

}
