package com.BusBookingProjectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchingForBus {
	
	
	@FindBy(xpath = "//input[@placeholder='Leaving from…']")
	WebElement origin;
	
	@FindBy(xpath = "//input[@placeholder='Going to…']")
	WebElement destination;
	
	@FindBy(xpath = "//button[@class='s103 s183 s188 s194 s199 s204 s209 s214 s591 s594']")
	WebElement searchbutton;
	
	public void origin() {
		origin.click();
		origin.clear();
		origin.sendKeys("Hyderabad");
	}
	
	public void destination() {
		destination.click();
		destination.clear();
		destination.sendKeys("Bangalore");
	}
	
	public void clickOnSearchButton() {
		searchbutton.clear();
		searchbutton.click();
	}
	
	

}
