package com.selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		
//		//Max window
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//
//		//Click Ok button
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//		
//		//Click on form
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@aria-autocomplete='list'])[1]")).click();
//	
//		//to select pune
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='PUNE JN - PUNE']")).click();
//		
//		//to click on to
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@aria-autocomplete='list'])[2]")).click();
//			
//		//to select nagpur
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='NAGPUR - NGP']")).click();
//				
//	
//		//to click select
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all'])[2]")).click();
//		
//		//to select tatkal
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='TATKAL']")).click();
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");

		Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("PUNE JN - PUNE");
		
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("NAGPUR - NGP");
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[normalize-space()='TATKAL']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
					
	}

}
