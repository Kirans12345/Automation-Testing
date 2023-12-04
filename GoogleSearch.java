package com.TestingWithJunitAssistedPractice;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static WebDriver driver=new ChromeDriver();
	
	@Test
	@BeforeAll
	public static void searchGoogle() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	@After
	public static void closeBrowser() {
		driver.close();

	}
	
	
	@Test
	public static void searchForFaceBook() throws InterruptedException {
		
		//WebElement staysignedout=driver.findElement(By.xpath("//button[@aria-label='Stay signed out']"));
		//staysignedout.click();
		
		WebElement search=driver.findElement(By.xpath("//textarea[@jsaction='paste:puy29d;']"));
		search.sendKeys("facebook.com");
		search.click();
		assertFalse(driver.getTitle().contains("facebook.com"));
		
	}

}
