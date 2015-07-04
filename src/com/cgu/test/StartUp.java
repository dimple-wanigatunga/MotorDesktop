package com.cgu.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.GlobalConstants;
import utils.SeleniumWrapper;

public class StartUp {
	

	
	public static void main(String[] args){
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://172.16.45.123/cgu_s2");
		String title = driver.getTitle();
		System.out.println("Title is"+title);
	}
	
}
