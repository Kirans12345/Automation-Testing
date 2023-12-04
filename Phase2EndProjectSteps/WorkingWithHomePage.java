package Phase2EndProjectSteps;

import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkingWithHomePage {
	
@FindBy(xpath = "//span[text()='Buy Now']")
public static WebElement buyNow;

public WorkingWithHomePage(WebDriver driver) { 
	PageFactory.initElements(driver, this);
// driver can now work with your elements and methods of this class
}

public String get_homepage_title() throws
InterruptedException {
String title = BackgroundClass.driver.getTitle();
return title;
}

public void click_On_BuyNow() throws InterruptedException
{
Thread.sleep(2000);
buyNow.click();
}
}
