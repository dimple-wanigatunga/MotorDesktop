package com.cgu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		//driver.wait(arg0);
		Select dropdownItem = new Select(driver.findElement(By.name("mydropdown")));
		dropdownItem.deselectByValue("Milk");
	//	dropdownItem
	}

}
