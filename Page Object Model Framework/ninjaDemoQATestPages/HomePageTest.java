package com.ninjaDemoQATestPages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ninjaDemoQABase.TestBase;
import com.ninjaDemoQAPages.HomePage;

@Listeners(ItestListenerClass.class)
public class HomePageTest extends TestBase {

	HomePage hp;

	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new HomePage(driver);
	}

	@Test(priority = '1')
	public void clickOnRegisterPage() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOnMyAccount();
		Thread.sleep(2000);
		hp.clickOnRegister();
		Thread.sleep(2000);

	}

	@Test(priority = '2')
	public void clickOnLogin() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickOnMyAccount();
		Thread.sleep(2000);
		hp.clickOnLogin();
		Thread.sleep(2000);

	}

	@AfterClass
	public void CloseApp() {

		driver.quit();
	}

}
