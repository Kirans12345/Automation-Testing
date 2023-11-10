package com.assisted.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/alerts-and-popups-in-selenium");
		
		driver.findElement(By.xpath("//*[@id=\"guideBannerSection\"]/div/div/div/div/a")).click();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().getText();
		driver.get("https://www.typeform.com/signup/?slug=simple-registration");
		driver.switchTo().alert().sendKeys("xyz");
		
	//	driver.switchTo().alert().close();
		//*[@id="input38"]
		
		//driver.findElements(By.xpath("//*[@id='input38']").s
		
	}

}
