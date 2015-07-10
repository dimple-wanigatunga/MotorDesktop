package com.cgu.test;

import java.util.Set;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.GlobalConstants;
import utils.SeleniumWrapper;

public class Comprehensive_PolicyType{
	
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
		 SeleniumWrapper.click(driver, GlobalConstants.COMPREHENSIVE);
	 }
	 
	 @Test(priority=5) 
	 public void clickNext(){
		 SeleniumWrapper.click(driver, GlobalConstants.ABOUT_THE_CAR_BUTTON);
	 }
	 
	 //ABOUT THE CAR PAGE
	 
		@Test(priority=6) 
		public void searchCarByRego(){

			SeleniumWrapper.click(driver, GlobalConstants.CAR_REGO_OPTION);
			SeleniumWrapper.click(driver, GlobalConstants.CAR_REGO_STATE_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.CAR_REGO_STATE);
			SeleniumWrapper.fill(driver, GlobalConstants.CAR_REGO_NUMBER_TEXTBOX, GlobalConstants.CAR_REGO_NUMBER);
			SeleniumWrapper.click(driver, GlobalConstants.VEHICLE_SEARCH_BUTTON);
			SeleniumWrapper.click(driver, GlobalConstants.REGO_NUM_CORRECT);
			
		}
		
		@Test(priority=7)
		public void fillAccessModification(){
			SeleniumWrapper.waitForElementPresent(driver, GlobalConstants.ACCESS_MOD_YES);
			SeleniumWrapper.click(driver, GlobalConstants.ACCESS_MOD_YES);
			SeleniumWrapper.waitForElementPresent(driver, GlobalConstants.ACCESS_MOD_VALUE_TEXTBOX);
			SeleniumWrapper.fill(driver,GlobalConstants.ACCESS_MOD_VALUE_TEXTBOX , GlobalConstants.ACCESS_MOD_VALUE);
			SeleniumWrapper.click(driver, GlobalConstants.TRACKING_DEV_YES);
			SeleniumWrapper.click(driver, GlobalConstants.MARKET_VALUE_YES);
		}
		
		@Test(priority=8)
		public void parkingAddress(){
			SeleniumWrapper.fill(driver, GlobalConstants.PARKING_ADDRESS_TEXTBOX, GlobalConstants.PARKING_POSTCODE);
			SeleniumWrapper.click(driver, GlobalConstants.PARKING_SUBURB);
			SeleniumWrapper.click(driver, GlobalConstants.PARKING_LOCATION_GARAGE);
		}
		
		@Test(priority=9)
		public void fillFinanceDetails(){
			SeleniumWrapper.click(driver, GlobalConstants.FINANCE_YES);
			SeleniumWrapper.click(driver, GlobalConstants.FINANCE_TYPE);
			SeleniumWrapper.click(driver, GlobalConstants.FINANCE_TYPE);
			//driver.findElement(GlobalConstants.FINANCE_TYPE).click();
			SeleniumWrapper.click(driver, GlobalConstants.FINANCE_COMPANY);
			//driver.findElement(GlobalConstants.FINANCE_COMPANY).click();
			//SeleniumWrapper.selectDropdown(driver, GlobalConstants.FINANCE_COMPANY, GlobalConstants.FINANCE_COMP_NAME);
			SeleniumWrapper.click(driver, GlobalConstants.ABOUT_THE_DRIVERS_BUTTON);
		}
		
		//About the Drivers Page
		@Test(priority=10)
		public void fillYoungestOwnerDetails(){
			
			SeleniumWrapper.click(driver, GlobalConstants.CALENDAR_ICON);
			
			SeleniumWrapper.click(driver, GlobalConstants.DOB_YEAR_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.YOUNG_OWNER_YEAROF_DOB);

			SeleniumWrapper.click(driver, GlobalConstants.DOB_MONTH_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.YOUNG_OWNER_MONTHOF_DOB);
			
			SeleniumWrapper.click(driver, GlobalConstants.YOUNG_OWNER_DTAEOF_DOB);
	
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_DRIVES_CAR_YES);
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_GENDER_FEMALE);
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_LICENCE_TYPE_FULL);
			
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_LICENCE_STATE_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_LICENCE_STATE);
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_YEARS_LICENSED_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_YEARS_LICENCED);
			
			SeleniumWrapper.click(driver, GlobalConstants.OWNER_AT_FAULT);
			
		}
		
		@Test(priority=11)
		public void fillYoungestRegulaDriverrDetails(){
		SeleniumWrapper.click(driver, GlobalConstants.YOUNGEST_REGULAR_DRIVER_OPTION_NO);
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_CAL_ICON);
		
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_YEAR_DROPDOWN);
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_YEAROF_DOB);
		
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_DOB_MONTH_DROPDOWN);
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_MONTHOF_DOB);

		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_DTAEOF_DOB);
		
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_GENDER_M);
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRIVER_LICENCE_TYPE_FULL);
	
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRI__YEARS_LICENCED_DROPDOWN);
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRI__YEARS_LICENCED_DROPDOWN);
		//driver.findElement(GlobalConstants.YOUNG_REG_DRI__YEARS_LICENCED_DROPDOWN).click();
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRI_YEARS_LICENCED);
		
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRI_LICENCE_STATE_DROPDOWN);
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRI_LICENCE_STATE);
		
		SeleniumWrapper.click(driver, GlobalConstants.YOUNG_REG_DRI_AT_FAULT);
		
		SeleniumWrapper.click(driver, GlobalConstants.DRIVER_UNDER_25_ALLOWED_NO);
		SeleniumWrapper.click(driver, GlobalConstants.GET_YOUR_QUOTE_BUTTON);
		
		}
		
		@Test(priority=12)
		public void fillYourQuote(){
			SeleniumWrapper.click(driver, GlobalConstants.PAYMENT_FREQ_FORTNIGHT);
			SeleniumWrapper.click(driver, GlobalConstants.WINDSCREEN_EXT_YES);
			SeleniumWrapper.click(driver, GlobalConstants.RATING_1_AT_ALL_FAULT);
			SeleniumWrapper.click(driver, GlobalConstants.EXCESS_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.EXCESS_VALUE);
			SeleniumWrapper.click(driver, GlobalConstants.RECALCULATE_BUTTON);
			//TO DO - WAIT
			
			//SeleniumWrapper.waitElementDisappear(driver, GlobalConstants.PLEASE_WAIT_MODAL_BOX);
			SeleniumWrapper.wait(8);
			SeleniumWrapper.click(driver, GlobalConstants.LOWKM_PURCHASE_BUTTON);

		}
		@Test(priority=13)
		public void fillCarDetails(){
			SeleniumWrapper.fill(driver, GlobalConstants.ODOMETER_READING, "1000");
			SeleniumWrapper.click(driver, GlobalConstants.SELECTED_ACCESSORIES_DROPBOX);
			SeleniumWrapper.click(driver, GlobalConstants.ACCESSORY_1);
			SeleniumWrapper.click(driver, GlobalConstants.MODIFICATION_1);
			SeleniumWrapper.click(driver, GlobalConstants.EXISTING_RUST_NO);
			SeleniumWrapper.click(driver, GlobalConstants.ROAD_WORTHY_YES);
			SeleniumWrapper.click(driver, GlobalConstants.FINANCIER_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.FINANCIER_DROPDOWN);
			SeleniumWrapper.click(driver, GlobalConstants.FINANCIER);
			SeleniumWrapper.waitForElementPresent(driver, GlobalConstants.FINANCIER_EDIT_BUTTON);
			SeleniumWrapper.click(driver, GlobalConstants.NEXT_OWNERS_DRIVERS_BUTTON);
		
		}
		
		
		@Test(priority=14)
		public void fillOwnerAndDriverHistory(){
			SeleniumWrapper.typeText(driver, GlobalConstants.OWNER1_FIRST_NAME, "JANE");
			SeleniumWrapper.typeText(driver, GlobalConstants.OWNER1_LAST_NAME, "SMITH");
			SeleniumWrapper.typeText(driver, GlobalConstants.OWNER1_CUSTOMER_NUMBER, "CUSTNUMBER001");
			SeleniumWrapper.typeText(driver, GlobalConstants.OWNER1_CONTACT_NUMBER, "0410134567");
			SeleniumWrapper.typeText(driver, GlobalConstants.OWNER1_EMAIL_ADDRESS, "DIMPLE.WANIGATHUNGA@EBIX.COM.AU");
			
			SeleniumWrapper.typeText(driver, GlobalConstants.ADDRESS_LINE1, "7A/B");
			SeleniumWrapper.typeText(driver, GlobalConstants.ADDRESS_LINE2, "PACIFIC HIGHWAY");
			SeleniumWrapper.typeText(driver, GlobalConstants.ADDRESS_SUBURB, "CHATSWOOD");
			SeleniumWrapper.click(driver, GlobalConstants.ADDRESS_STATE_DROPDOWN);
			//SeleniumWrapper.click(driver, GlobalConstants.ADDRESS_STATE_DROPDOWN);
			//SeleniumWrapper.wait(6);
			SeleniumWrapper.click(driver, GlobalConstants.ADDRESS_STATE);
			SeleniumWrapper.typeText(driver, GlobalConstants.ADDRESS_POSTCODE, "2067");
			
			SeleniumWrapper.typeText(driver, GlobalConstants.YOUNG_DRIVER_FIRST_NAME, "PETER");
			SeleniumWrapper.typeText(driver, GlobalConstants.YOUNG_DRIVER_LAST_NAME, "SMITH");
			
			SeleniumWrapper.click(driver, GlobalConstants.CONVICTION_Q1_OPTION_NO);
			SeleniumWrapper.click(driver, GlobalConstants.CONVICTION_Q2_OPTION_NO);
			SeleniumWrapper.click(driver, GlobalConstants.CONVICTION_Q3_OPTION_NO);
			SeleniumWrapper.click(driver, GlobalConstants.CONVICTION_Q4_OPTION_NO);
			
			SeleniumWrapper.click(driver, GlobalConstants.DECL_PRIVACY_NEXT_BUTTON);
	
		}
		
		@Test(priority=15)
		public void fillDeclarationAndPrivacy(){
			SeleniumWrapper.click(driver, GlobalConstants.DUTY_DICLOSURE_READ_YES);
			SeleniumWrapper.click(driver, GlobalConstants.DECLARATION_Q1);
			SeleniumWrapper.click(driver, GlobalConstants.DECLARATION_Q2);
			SeleniumWrapper.click(driver, GlobalConstants.PRIVACY_Q1);
			SeleniumWrapper.click(driver, GlobalConstants.PRIVACY_Q2);
			SeleniumWrapper.click(driver, GlobalConstants.PDS_YES);
			SeleniumWrapper.click(driver, GlobalConstants.NEXT_PAYMENT_BUTTON);
			
		}
		
		@Test(priority=16)
		public void fillPaymentDirectDebit(){
			SeleniumWrapper.click(driver, GlobalConstants.DIRECT_DEBIT_OPTION);
			SeleniumWrapper.typeText(driver, GlobalConstants.ACC_HOLDER_NAME, "DIMPLE WANIGATHUNGA");
			SeleniumWrapper.typeText(driver, GlobalConstants.ACC_BSB_NUMBER, "123654");
			SeleniumWrapper.typeText(driver, GlobalConstants.ACC_NUMBER, "12345678");
			SeleniumWrapper.click(driver, GlobalConstants.PURCHASE_POLICY_BUTTON);
		}
		
		@Test(priority=17)
		public void email(){
			SeleniumWrapper.click(driver, GlobalConstants.EMAIL_POL_SCHEDULE);
			SeleniumWrapper.typeText(driver, GlobalConstants.EMAIL_DOCS, "DIMPLE.WANIGATUNGA@GMAIL.COM");
			SeleniumWrapper.click(driver, GlobalConstants.SEND_BUTTON);
			SeleniumWrapper.click(driver, GlobalConstants.OK_BUTTON);
		}
		
	  @AfterTest
	  public void terminateBrowser() {
		  SeleniumWrapper.closeBrowser(driver);
	  }

}
