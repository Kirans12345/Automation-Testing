package Phase2EndProjectRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "J:\\MPHASIS\\Kiran S Eclipse\\Phase2\\CucumberPhase-2PracticeProject\\src\\test\\java\\Phase2EndProjectFeature\\StarHealth.feature", glue = {
"steps" }, plugin = { "html:target/Cucumberreport.html", "pretty",

"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"timeline:test-output-thread/" })

public class StarHealthRunner {
	
	
}
