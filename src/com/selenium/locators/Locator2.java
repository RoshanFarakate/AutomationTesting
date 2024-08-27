package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//BasicWay		
//		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("abc");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	
		
//Substring
//		driver.findElement(By.cssSelector("input[id*='log']")).sendKeys("abc");
//		driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("1234");

		
//parent-child
		//CssSelector	Parent-tag Child-tag Child-tag1
		//Xpath			//Parent-tag/Child-tag/Child-tag1
		
//Index
		//CssSelector	Tag[attribute='value']:nth-child(2)
		//Xpath			//Tag[@attribute='value'][2]
		
//Css selector By using tag and class name/id
//		Tag.className
//		Tag#id
		
		driver.findElement(By.cssSelector("input[title='Sign in']")).click();
		
	}

}
