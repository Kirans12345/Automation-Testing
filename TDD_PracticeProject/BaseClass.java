package com.TDD_PracticeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BaseClass {
	WebDriver driver;
	
	//@FindBy(xpath = "")
	//WebElement 

	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
	}
	
	
}
