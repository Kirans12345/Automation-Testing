package com.BusBookingProjectRunnable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BusBookingProjectBase.BaseClass;
import com.BusBookingProjectPages.BusBookingElements;
import com.BusBookingProjectPages.SearchingForBus;
public class BusBookingTestPage extends BaseClass {

	BusBookingElements bbe;
	SearchingForBus sfb;
	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		bbe = new BusBookingElements(driver);
	}

	@Test(priority = '1')
	public void loginPage() throws InterruptedException {

		Thread.sleep(2000);
		bbe.clickonLogin();
		Thread.sleep(2000);
		bbe.continueWithEmail();
		Thread.sleep(2000);
		bbe.clickOnEmail();
		Thread.sleep(2000);
		bbe.clickOnpassword();
		bbe.clickOnLoginButton();
		driver.close();

	}
	
	/*@Test(priority='2')
		public void search() throws InterruptedException {
	
		openBrowser("Chrome");
		Thread.sleep(5000);
		sfb.origin();
		Thread.sleep(2000);
		sfb.destination();
		Thread.sleep(2000);
		sfb.clickOnSearchButton();
	
		}*/
	@AfterMethod
	public void closeApp() {

		driver.quit();
	}

}
