package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFileScenario {

	// A step defination file is a java file
	// In the steps defination file we implement
	// the steps written for a scenario in fature file
	// Every steps is a test method
	// Every Gherkin keywords used in feature file is an
	// annotation in this file

	@Given("I open the chrome browser")
	public void openBrowser() {

		System.out.println("This method will open browser");
	}

	@When("I enter rediff mypage URL")
	public void openMyPageURL() {
		System.out.println("This method will open the URL");
	}

	@Then("I capture the title of the page")
	public void captureTitle() {

		System.out.println("This method will capture title");
	}

	@Then("I enter username as admin and password as admin@123")
	public void enterUsernamePassword() {

		System.out.println("This method will enter username and password");
	}

	@When("I click on login button")
	public void clickOnLogin() {

		System.out.println("This method will click on login button");
	}

	@Then("I should see an Error message")
	public void viewErrorMessage() {

		System.out.println("This method will show error message");
	}

	@And("I click on Click here link")
	public void clickOnLink() {

		System.out.println("This method will click on click here link");
	}

	@And("I close the browser")
	public void closeBrowser() {

		System.out.println("Close the browser");
	}

}
