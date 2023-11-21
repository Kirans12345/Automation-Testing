package com.dbConnection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Testing amazon website using Selenium web driver

public class TestingAmazonJenkins {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		//to maximize the screen
		driver.manage().window().maximize();

		//passing the amazon link through get()
		driver.get("https://www.amazon.in/");

		//---automation script using the page object model class this topic was not explained and they told us to skip it

		WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

		//Instantiating the action class

		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();

		//providing some sleep time for page to get loaded
		Thread.sleep(5000);

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		//sending the credentials for signing in and to verify

		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7411616235");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Kiran4301@s");

		//clicking on sign in button

		driver.findElement(By.id("signInSubmit")).click();
		
		//Scrolling the site
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");


		//Sign in completed

		//Searching for iphone under search bar

		//navigating to amazon webpage

		driver.navigate().to("https://www.amazon.in/");

		//Wait time to the page to get loaded

		Thread.sleep(3000);


		driver.findElement(By.linkText("Mobiles")).click();

		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));

		a.moveToElement(mobile).build().perform();
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("Apple")).click();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	


		driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();	

		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		//Navigating again to amazon webpage


		Thread.sleep(3000);

		//Entering iphone13 in search bar

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");

		//pressing submit button
		
		Thread.sleep(3000);

		driver.findElement(By.id("twotabsearchtextbox")).submit();
		
		//waiting for page to get loaded
		
		Thread.sleep(3000);	

		driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();

		Thread.sleep(3000);
		
		//Adding it to wishlist
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	

		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Your Wish List']")).click();
		
		//To exit from all the tabs

		driver.quit();

		




	}
}
