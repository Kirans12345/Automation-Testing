package com.assisted.practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssAndXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		//Using css selector
		
		driver.findElement(By.cssSelector("input#text"));
		driver.findElement(By.cssSelector("a.skip-link"));
		driver.findElement(By.cssSelector("div[id=nav-cover]"));

		//Using xPath
		
		driver.findElement(By.xpath("//input[@value='MNAVPZBFOGM4']"));
		driver.findElement(By.xpath("//*[@id=\"glowValidationToken\"]"));
	}

}
