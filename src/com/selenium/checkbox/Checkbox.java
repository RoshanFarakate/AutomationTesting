package com.selenium.checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");

		Thread.sleep(1000);
		
		driver.manage().window().maximize();

		Thread.sleep(1000);
		
		
		//print check boxes
		List<WebElement> l = driver.findElements(By.xpath("(//div[@class='col-xs-12 remove-padding'])[1]"));
		
		for(WebElement i:l) {
			System.out.println(i.getText());
		}
		
		//select one check box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Flexible With Date']")).click();
		
		//click on search button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		
		
	}

}
