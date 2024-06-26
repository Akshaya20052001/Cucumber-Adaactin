package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//input[@id='logout']")
	private WebElement logout;
	
	@FindBy(xpath ="//td[contains(text(),'You have successfully')]")
    private WebElement confirmation_Msg;
	
	public Booking_Confirmation_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getConfirmation_Msg() {
		return confirmation_Msg;
	}
	
	
	
	
	
	
}
