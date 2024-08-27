package com.selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSeggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.goibibo.com/");

		Thread.sleep(1000);
		
		driver.manage().window().maximize();

		Thread.sleep(1000);
		
		//close the ad
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		
		//Select and click the portion to input data
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//p[text()='Enter city or airptort'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']//div[contains(@class,'sc-12foipm-2 eTBlJr fswFld')]")).click();
		

		//Type Pune
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		
		//select pune
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='(PNQ)']")).click();
		
		
		//Type nagpur in to input
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='sc-12foipm-22 OmQvV']//p[@class='sc-12foipm-6 erPfRs'][normalize-space()='Enter city or airport']")).sendKeys("nagpur");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nagpur");
		
		//select nagpur
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='(NAG)']")).click();
		
		
	}
}