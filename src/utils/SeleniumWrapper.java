package utils;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrapper{
	
	public static WebDriver webDriver = null;
	
	
	public static WebDriver getInstance(String browserType) {
		
		DesiredCapabilities capability = new DesiredCapabilities();		
		//String browserName = browserType;
		capability.setJavascriptEnabled(true);
		
		if(browserType.equalsIgnoreCase("FIREFOX")){
			
			capability = DesiredCapabilities.firefox();
			capability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
			webDriver = new FirefoxDriver(capability);
			webDriver.manage().window().maximize();
			System.out.println("Launching Firefox");
		}
		else if(browserType.equalsIgnoreCase("CHROME")){

			File file = new File(System.getProperty("user.dir")+"//src//chromedriver");
			
			//TODO Check support for other Operating Systems
			if(OS.isFamilyWindows()){
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()+".exe");
			}
			else{
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			}
	        
			capability = DesiredCapabilities.chrome();
			webDriver = new ChromeDriver(capability);
			//webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			System.out.println("Launching Chrome");
		}
		else if(browserType.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//src//IEDriverServer.exe");
			capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(
					InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					true);
			webDriver = new InternetExplorerDriver(capability);
			webDriver.manage().window().maximize();
			System.out.println("Launching IE");
		}
		
		return webDriver;	
	}
	
	/*
	 * This method is to launch the URL of the page
	 */
	
	public static void  launchURL(WebDriver driver,String Url){
		driver.get(GlobalConstants.BASEURL);
	}
	
	/*
	 * This is to retrieve the current page title
	 */
	
	public static String getPageTitle(WebDriver driver){
		String currentPageTitle ="";
		if(driver.getTitle() != null){
			currentPageTitle = driver.getTitle();
		}
		return currentPageTitle;
	}
	
	/*
	 * This method is to type for a value into a text box
	 */
	
	public static void typeText(WebDriver driver, By locator, String text){
		
		if(waitForElementPresent(driver,locator)){
			
			WebElement textfield = null;
			textfield = driver.findElement(locator);
			textfield.clear();
			textfield.sendKeys(text);
			
			//Reporting FInctionality
	
		}
		
	}
	
	/*
	 *  This method is to click on a link or an element
	 */

	public static void click(WebDriver driver, By locator){
		if(waitForElementPresent(driver, locator)){		
			driver.findElement(locator).click();
		}
		
		
	}
	
	/*
	 * This is to get the current URL of the page
	 */
	public static String getCurrentUrl (WebDriver driver){
		String currentUrl = "";
		
		if( driver.getCurrentUrl() != null){
		 currentUrl = driver.getCurrentUrl();
		}
		return currentUrl;
	}
	
/*
 * This is to check the current status of a radio button
 */
public static boolean radioButtonChecked(WebDriver driver,By locator){
	boolean isSelected = false;
	WebElement element;

	element =  driver.findElement(locator);
	String text = element.getAttribute("class");
	System.out.println("Text is -- "+text);
	String lastWord = text.substring(text.lastIndexOf(" ")+1);
	System.out.println("lastWord-- "+lastWord);
	
	if(lastWord.equalsIgnoreCase(GlobalConstants.CHECKED)){
		isSelected = true;
	}

	return isSelected;
	

}


public static void fill(WebDriver driver,By locator,String text){
	
	if(waitForElementPresent(driver, locator)){		
	driver.findElement(locator).sendKeys(text);
	}
}

public static void selectDropdown(WebDriver driver,By locator,String Text){
	
	if(waitForElementPresent(driver, locator)){			
	Select dropdownElement = new Select(driver.findElement(locator));
	dropdownElement.selectByValue(Text);
	}
}

public static void  waitElementDisappear(WebDriver driver,By locator){
	
		boolean dialogExists = driver.findElement(locator).isDisplayed();

		while (dialogExists) {

		dialogExists = driver.findElement(locator).isDisplayed();

		if (dialogExists == false)

		break;

		}
		
	
}

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
/*
 * This method is used to wait for a given time in seconds
 */
	
	public static void wait(int seconds){
		
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}	
	
/*
 * This method is used wait for an element to be present on page
 */
	
	public static boolean waitForElementPresent(WebDriver driver,By locator){
		
		boolean isDisplayed = false;
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, GlobalConstants.WAIT_TIME);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		SeleniumWrapper.wait(GlobalConstants.DEF_TIME_IN_SEC);
		if(element != null && element.isDisplayed() && element.isEnabled()){
			SeleniumWrapper.highlightElement(driver, element);
			isDisplayed = true;
		}		
		return isDisplayed;
		}
	
	/*
	 * This method is used to highlight the element while executing
	 */
	
	private static void highlightElement(WebDriver driver,WebElement element){
		
		for(int i=0;i<1;i++) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
					element, "color: red; border: 5px solid red;");
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
					element, " ");
			
		}
		
	}
	
	/*
	 * This method is used to parse GlobalConstants.class and retrieve locator value for string
	 */
	
	public static String getLocatorNameString(String locator){
		String locatorValue ="";
		Class<GlobalConstants> c = GlobalConstants.class;
		
		for (Field f : c.getDeclaredFields()){
			int mod = f.getModifiers();
		
			if(Modifier.isStatic(mod) && Modifier.isPublic(mod) && Modifier.isFinal(mod)){
				try {
					if(f.get(null).equals(locator)){
						locatorValue = f.getName();
					}
				} catch (IllegalArgumentException e) {
					
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					
					e.printStackTrace();
				}
				
			}
			
		
			
		}
		
		return locatorValue;
	}

	/*
	 * This method is used to parse GlobalConstants.class and retrieve the locator name
	 */
	
	
	public static String getLocatorName(By locator){
		
	String locatorValue="";
	Class<GlobalConstants> c = GlobalConstants.class;
	for(Field f : c.getDeclaredFields()){
		
		int mod = f.getModifiers();
		if(Modifier.isStatic(mod) && Modifier.isFinal(mod) && Modifier.isPublic(mod)){
			
			try {
				if(f.get(null).equals(locator)){
					locatorValue = f.getName();
				}
			} catch (IllegalArgumentException e) {

				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			}
		}
		
	}
		
		return locatorValue;
	}
	

	
	
	
	

}
