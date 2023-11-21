package com.dbConnection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonJenkins {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		//To maximize the chrome window
		driver.manage().window().maximize();
		
		//Opening the amazon website
		
		driver.get("https://amazon.in/");
		
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		//automation script using the page object model class this topic was not explained and they told us to skip it
		
		//providing some sleep time for page to get loaded
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	
		Thread.sleep(5000);

		//sending the credentials for signing in and to verify
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[1]")).sendKeys("7411616235");
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[3]")).sendKeys("Kiran4301@s");
		
		//click on login button
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[5]")).click();
		//Verify the page’s ability to scroll.
		

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(5000);
		
		//Search for a product, say, “iPhone 13” under the “Mobile” category
		driver.navigate().to("https://amazon.in/");
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']")).click();
		
		//Check that filters are being used while looking for a product.
		
		driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Faw%2Fd%2FB09G9BL5CP&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inamazon&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")).click();
		
		//Check to see whether a Confirmation box appears.
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[3]/a[3]/span"));
		

		
		driver.close();
	}

}
