package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	
	public WebDriver driver;
	
	
	@FindBy(xpath= "//input[@id='radiobutton_1']")
	private WebElement radio_Button;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement continue_Button;
	
	public Select_Hotel_Page(WebDriver driver2) {
	    this.driver = driver2;
	    PageFactory.initElements(driver, this);
	}


	public WebElement getContinue_Button() {
		return continue_Button;
	}


	public WebElement getRadio_button() {
		return radio_Button;
	}
	
	
	
	

}
