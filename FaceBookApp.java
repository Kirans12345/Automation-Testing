package com.TestingWithJunitAssistedPractice;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApp {
	
	static WebDriver driver=new ChromeDriver();
	
	@Test
	@Before
	public void searchFacebook() {
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("automationtester@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("automationtester@12345");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void getTitle() {
		assertFalse(driver.getTitle().contains("Login -HomePage"));
	}
	
	@Test
	@AfterAll
	public static void close() {
		driver.close();
	}

}
