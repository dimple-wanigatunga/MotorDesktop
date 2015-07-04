package utils;

import org.openqa.selenium.By;

public interface GlobalConstants {
	
	public static final String INTERNET_EXPLORER = "IE";
	public static final String FIREFOX = "FIREFOX";
	public static final String CHROME = "CHROME";
	
	//TODO isn't 120 seconds too long?
	public static final long WAIT_TIME = 60;
	public static final int DEF_TIME_IN_SEC =1;
	public static final String CHECKED = "CHECKED";
	
	//Landing Page
	public static final String BASEURL = "http://172.16.45.123/cgu_s2/";
	public static final String EXP_LAND_TITLE = "CGU Insurance Ltd 3 - Get a Quote";
	//public static final By CGUB2C = By.xpath("(//a[contains(text(),'CGU Direct B2C')])[1]");
	public static final By MOTOR_INSURANCE_LINK  = By.xpath("//*[contains(text(),'Motor Insurance')]");
	
	
	//Cover Type page
	
	public static final By TYPE_OF_INSURANCE= By.xpath("//*[contains(@id,'lbl_business_type_P')]/div");
	public static final By COMPREHENSIVE = By.xpath("//*[@id='lbl_cover_type_c']");
	public static final By ABOUT_THE_CAR_BUTTON = By.xpath("//*[@id='ctl00_next']");
	
	//About the Car Page - Search Vehicle
	public static final By CAR_REGO_OPTION = By.xpath("//*[@id='lbl_find_registration']");
	//public static final By CAR_REGO_STATE_DROPDOWN = By.xpath("//*[contains(text(),'Please Choose...')]");
	public static final By CAR_REGO_STATE_DROPDOWN = By.xpath("//*[@id='ctl00_Main_ddlServiceReqState_chosen']/a");
	public static final By CAR_REGO_STATE = By.xpath("//li[contains(text(),'NSW')]");
	
	public static final By CAR_REGO_NUMBER_TEXTBOX = By.id("ctl00_Main_txtServiceReqRego");
	public static final String CAR_REGO_NUMBER = "test";
	public static final By VEHICLE_SEARCH_BUTTON = By.id("ctl00_Main_MotorwebVehicleSearchBtn");
	public static final By REGO_NUM_CORRECT= By.id("lbl_reg_num_correct_Y");
	
	//About the Car - Accessories and Modifications
	public static final By ACCESS_MOD_YES = By.xpath("//*[@id='lbl_has_accessories_Y']");
	public static final By ACCESS_MOD_VALUE_TEXTBOX = By.xpath("//*[@id='ctl00_Main_txt_accessories_value']"); 
	public static final String ACCESS_MOD_VALUE = "1000";
	public static final By TRACKING_DEV_YES = By.id("lbl_car_gps_Y");
	
	//About the Car - Market and Agreed Value
	
	public static final By MARKET_VALUE_YES = By.id("lbl_agreed_value_N");
	
	//About the Car - Parking Details
	public static final By PARKING_ADDRESS_TEXTBOX = By.id("ctl00_Main_txt_park_postcode");
	public static final String PARKING_POSTCODE = "2154 ";
	public static final By PARKING_SUBURB = By.xpath("//a[contains(text(),'CASTLE HILL')]");
	public static final By PARKING_LOCATION_GARAGE = By.xpath(".//*[@id='lbl_car_park_type_G']");
	
	//About the Car - Finance Details
	public static final By FINANCE_YES = By.xpath(".//*[@id='lbl_is_fin_Y']");
	public static final By FINANCE_TYPE = By.xpath("//*[@id='ctl00_Main_ddl_finance_type_chosen']/a");
	public static final By FINANCE_COMPANY = By.xpath("//li[contains(text(),'Finance Company Secured Loan')]");
	public static final String FINANCE_COMP_NAME = "Finance Company Secured Loan";
	public static final By ABOUT_THE_DRIVERS_BUTTON = By.id("ctl00_next");
	
	//About the Drivers -Youngest Owner details
	public static final By CALENDAR_ICON = By.xpath("//*[@id='ctl00_div_main']/div[1]/div/div/div[1]/div/fieldset/button[1]");
	public static final By DOB_MONTH_DROPDOWN = By.xpath("(//*[@id='ui-datepicker-div']/div/div/select[1])[1]");
	public static final By YOUNG_OWNER_MONTHOF_DOB = By.xpath("//*[contains(text(),'May')]");
	public static final By DOB_YEAR_DROPDOWN = By.className("ui-datepicker-year");
	public static final By YOUNG_OWNER_YEAROF_DOB = By.xpath("//*[contains(text(),'1983')]");
	public static final By YOUNG_OWNER_DTAEOF_DOB = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a");
	
	public static final By OWNER_DRIVES_CAR_YES = By.id("lbl_does_person_drive_car_Y");
	public static final By OWNER_GENDER_FEMALE = By.id("lbl_owner_gender_F");
	public static final By OWNER_LICENCE_TYPE_FULL = By.id("lbl_owner_licence_type_1");
	
	public static final By OWNER_LICENCE_STATE_DROPDOWN = By.xpath("//*[@id='ctl00_Main_ddl_owner_licence_state_chosen']/a");
	public static final By OWNER_LICENCE_STATE = By.xpath("//li[contains(text(),'NSW')]");
	
	public static final By OWNER_YEARS_LICENSED_DROPDOWN = By.xpath("//*[@id='ctl00_Main_ddl_owner_years_licensed_chosen']/a");
	public static final By OWNER_YEARS_LICENCED = By.xpath("//*[@id='ctl00_Main_ddl_owner_years_licensed_chosen']/div/ul/li[10]");
	
	public static final By OWNER_AT_FAULT = By.id("lbl_owner_at_fault_0");
	
	//About the Drivers - Youngest Regular Driver 
	public static final By YOUNGEST_REGULAR_DRIVER_OPTION_NO = By.id("lbl_is_owner_youngest_regular_N");
	public static final By YOUNG_REG_DRIVER_CAL_ICON = By.xpath(".//*[@id='dob_driver_visual']");
			
	public static final By YOUNG_REG_DRIVER_DOB_MONTH_DROPDOWN = By.xpath("(.//*[@id='ui-datepicker-div']/div/div/select[1])");
	public static final By YOUNG_REG_DRIVER_MONTHOF_DOB = By.xpath("//*[contains(text(),'Nov')]");
	public static final By YOUNG_REG_DRIVER_YEAR_DROPDOWN = By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]");
	public static final By YOUNG_REG_DRIVER_YEAROF_DOB = By.xpath("//*[contains(text(),'1985')]");
	public static final By YOUNG_REG_DRIVER_DTAEOF_DOB = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a");
	
	public static final By YOUNG_REG_DRIVER_GENDER_M = By.xpath("//*[@id='lbl_driver_gender_M']");
	public static final By YOUNG_REG_DRIVER_LICENCE_TYPE_FULL = By.xpath("//*[@id='lbl_driver_licence_type_1']");
			
	public static final By YOUNG_REG_DRI_LICENCE_STATE_DROPDOWN = By.xpath("//*[@id='ctl00_Main_ddl_driver_licence_state_chosen']/a");
	public static final By YOUNG_REG_DRI_LICENCE_STATE = By.xpath("//*[@id='ctl00_Main_ddl_driver_licence_state_chosen']//li[contains(text(),'NSW')]");
	
	public static final By  YOUNG_REG_DRI__YEARS_LICENCED_DROPDOWN = By.xpath("//*[@id='ctl00_Main_ddl_driver_years_licensed_chosen']/a");//By.id("//*[@id='ctl00_Main_ddl_driver_years_licensed_chosen']/a"); //By.xpath("(//*[contains(text(),'Please choose...')])[9]");
	public static final By  YOUNG_REG_DRI_YEARS_LICENCED = By.xpath("//*[@id='ctl00_Main_ddl_driver_years_licensed_chosen']//li[contains(text(),'7')]");
	public static final By  YOUNG_REG_DRI_AT_FAULT = By.xpath("//*[@id='lbl_driver_at_fault_0']");
	
	public static final By DRIVER_UNDER_25_ALLOWED_NO = By.xpath("//*[@id='lbl_exclude_under_25_Y']");
	public static final By GET_YOUR_QUOTE_BUTTON = By.xpath(".//*[@id='ctl00_next']");
	
	//Your Quote Page
	public static final By PAYMENT_FREQ_FORTNIGHT = By.id("btn_payment_freq_F");
	public static final By WINDSCREEN_EXT_YES = By.id("lbl_windscreen_Y");
	public static final By RATING_1_AT_ALL_FAULT = By.id("lbl_protect_all_P");
	public static final By EXCESS_DROPDOWN = By.id("ctl00_Main_ddl_excess");
	public static final By EXCESS_VALUE = By.xpath("//*[contains(text(),'700')]");
	public static final By RECALCULATE_BUTTON = By.id("ctl00_Main_btnCalculate");
	public static final By PLEASE_WAIT_MODAL_BOX = By.xpath("html/body/div[5]/div");
	public static final By LOWKM_PURCHASE_BUTTON = By.xpath("(//*[@id='ctl00_Main_btn_purchase'])[3]");
	
	//Car Details Page
	
	public static final By ODOMETER_READING = By.id("ctl00_Main_txtLowKMReading");
	public static final By SELECTED_ACCESSORIES_DROPBOX = By.id("ctl00_Main_hdn_selected_accessories");
	public static final By ACCESSORY = By.xpath("//li[contains(text(),'Air Bag')] ");
}
