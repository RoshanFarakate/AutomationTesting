package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.id("login1")).sendKeys("abc");
		driver.findElement(By.name("passwd")).sendKeys("1234");
		driver.findElement(By.className("lblkeepme")).click();
//		driver.findElement(By.className("signinbtn")).click();
//		System.out.println(driver.findElement(By.id("div_login_error")).getText());
//		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Password")).click();
		driver.navigate().back();
		driver.navigate().forward();
		
//		driver.close();	
	}

}
