package Phase2EndProjectSteps;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundClass {
	
public static WebDriver driver = new ChromeDriver();

@AfterAll
public static void Close_Browser() throws InterruptedException { 
	System.out.println("Browser closed"); driver.close();

}
}
