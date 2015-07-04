package com.cgu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://172.16.45.123");
		driver.findElement(By.xpath("(//a[contains(text(),'CGU Direct B2C')])[2]")).click();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(text(),'Motor Insurance')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[contains(@id,'lbl_business_type_P')]/div")).click();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element =  driver.findElement(By.xpath("//*[contains(@id,'lbl_business_type_P')]/div"));
		String text = element.getAttribute("class");
		System.out.println("Text is -- "+text);
		String lastWord = text.substring(text.lastIndexOf(" ")+1);
		System.out.println("lastWord-- "+lastWord);

}
}
