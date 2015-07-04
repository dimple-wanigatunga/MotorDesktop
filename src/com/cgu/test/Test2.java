package com.cgu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test2 {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//src//IEDriverServer.exe");
		InternetExplorerDriver iedriver = new InternetExplorerDriver();
		iedriver.manage().window().maximize();
		iedriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		iedriver.get("http://172.16.45.123");
		iedriver.findElementByXPath("//table[2]/tbody/tr[2]/td[3]/a[1]").click();
		iedriver.findElementByXPath("//*[@id='QteCguMv']").click();
		
		//First Page
		iedriver.findElementByXPath("//*[@id='lbl_business_type_P']").click();
		iedriver.findElementByXPath("//*[@id='lbl_cover_type_c']").click();
		iedriver.findElementByXPath("//*[@id='policy_start_date_visual']").clear();
	
		iedriver.findElementByXPath("//*[@id='policy_start_date_visual']").sendKeys("30/06/2015");
		
		
		iedriver.findElementByXPath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]").click();
		iedriver.findElementByXPath("//*[@id='ctl00_next']").click();
		
		//Second Page
		
		iedriver.findElementByXPath("//*[@id='lbl_find_registration']").click();
		
		iedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddlServiceReqState_chosen']/a").click();
		
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddlServiceReqState_chosen']/div/ul/li[4]").click();
		
		iedriver.findElementByXPath("//*[@id='ctl00_Main_txtServiceReqRego']").sendKeys("test");
		iedriver.findElementByXPath("//*[@id='ctl00_Main_MotorwebVehicleSearchBtn']").click();
		iedriver.findElementByXPath("//*[@id='lbl_has_accessories_N']").click();
		iedriver.findElementByXPath("//*[@id='lbl_agreed_value_N']").click();
		
		iedriver.findElementByXPath("//*[@id='ctl00_Main_txt_park_postcode']").sendKeys("2154");
		iedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//iedriver.findElementByXPath("//*[@id='ctl00_Main_txt_park_postcode']").sendKeys(Keys.ENTER);
		//iedriver.findElementByXPath("//*[@id='ui-active-menuitem']").click();
		String abc = iedriver.findElement(By.id("//*[@id='ui-active-menuitem']")).getText();
		System.out.println("****************"+abc);
		
		iedriver.findElementByXPath("//*[@id='lbl_car_park_type_G']").click();
		iedriver.findElementByXPath("//*[@id='lbl_is_fin_Y']").click();
		
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddl_finance_type_chosen']/a").click();
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddl_finance_type_chosen']/div/ul/li[2]").click();
		iedriver.findElementByXPath("//*[@id='ctl00_next']").click();
		
		//Third page
		
		iedriver.findElementByXPath("//*[@id='dob_youngest_owner_visual']").clear();
		iedriver.findElementByXPath("//*[@id='dob_youngest_owner_visual']").sendKeys("14/05/1983");
		iedriver.findElementByXPath("//*[@id='dob_youngest_owner_visual']").sendKeys(Keys.ENTER);
		iedriver.findElementByXPath(".//*[@id='lbl_does_person_drive_car_Y']").click();
		iedriver.findElementByXPath(".//*[@id='lbl_does_person_drive_car_Y']").sendKeys(Keys.ENTER);
		iedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		iedriver.findElementByXPath("//*[@id='lbl_owner_gender_M']").click();
		iedriver.findElementByXPath("//*[@id='lbl_owner_licence_type_1']").sendKeys(Keys.ENTER);
		
		iedriver.findElementByXPath("//*[@id='lbl_owner_licence_type_1']").click();
		iedriver.findElementByXPath("//*[@id='lbl_owner_licence_type_1']").sendKeys(Keys.ENTER);
		
	
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddl_owner_licence_state_chosen']").click();
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddl_owner_licence_state_chosen']/div/ul/li[3]").click();
		
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddl_owner_years_licensed_chosen']/a").click();
		iedriver.findElementByXPath("//*[@id='ctl00_Main_ddl_owner_years_licensed_chosen']/div/ul/li[10]").click();
		
		iedriver.findElementByXPath("//*[@id='lbl_owner_at_fault_0']").click();
		iedriver.findElementByXPath("//*[@id='lbl_owner_at_fault_0']").click();
		
		iedriver.findElementByXPath("////*[@id='lbl_is_owner_youngest_regular_N']").click();
		
	}

}
