package com.cgu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.uftHelp.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('Hello World!')");
		
		String sDomain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain = "+sDomain);
		
		String sTitle = js.executeScript("return document.title;").toString();
		System.out.println("Title = "+sTitle);
		
		//Click on an item:
		String element ="ui-id-5";
		//js.executeScript("arguments[1].click();", element);
		js.executeScript("window.document.getElementById('ui-id-5').click()");
		
		
		
		
	}

}
