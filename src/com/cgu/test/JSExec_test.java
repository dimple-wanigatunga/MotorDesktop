package com.cgu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExec_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.au/");
		driver.manage().window().maximize();driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String element1 = "gs_htif0";
		WebElement element2 = driver.findElement(By.id(element1));
		
		for(int i=0;i<1;i++){
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	                element2, "color: green; border: 2px solid red;");
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	                element2, "");
		}
    

	}

}
