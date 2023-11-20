package com.app.testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation {
	WebDriver driver;
	
	@Test
	@BeforeMethod
	public void openpage() {
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void login() throws InterruptedException {
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("demouser1@gmail1.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		
	}
	@Test
	public void logout() throws InterruptedException {
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(5000);

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("demouser1@gmail1.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
}
