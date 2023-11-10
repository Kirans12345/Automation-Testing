package com.assisted.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWaysForLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=6994760948841758367&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007773&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		
		//Using ID as a Locator
		
		driver.findElement(By.id("nav-top"));
		
		//Using Class as a locator

		driver.findElement(By.className("a-section a-spacing-none aok-relative"));
		
		//Using name as a locator
		
		driver.findElement(By.name("google-site-verification"));
		
		//Using LinkText as a locator
		
		driver.findElement(By.linkText("Amazon Bestsellers"));
		
		//Using Xpath as a locator
		
		driver.findElement(By.xpath("//a[@class='skip-link']"));
		
		//Using csslocator
		
		driver.findElement(By.cssSelector("#nav-top"));
		
		
		
		
	}

}
