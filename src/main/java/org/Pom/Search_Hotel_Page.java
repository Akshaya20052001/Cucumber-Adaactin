package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement Hotel;
	
	@FindBy(xpath ="//select[@id='room_type']")
	private WebElement room_Type;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement number_Of_Rooms;
	
	@FindBy(xpath ="//input[@id='datepick_in']")
	private WebElement check_In_Date;
	
	@FindBy(xpath ="//input[@id='datepick_out']")
	private WebElement check_Out_Date;
	
	@FindBy(xpath ="//select[@id='adult_room']")
	private WebElement adults_Per_Room;
	
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement children_Per_Room;
	
	@FindBy(xpath ="//input[@id='Submit']")
	private WebElement search_Button;
	
	

	public Search_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNumber_Of_Rooms() {
		return number_Of_Rooms;
	}

	public WebElement getCheck_In_Date() {
		return check_In_Date;
	}

	public WebElement getCheck_Out_Date() {
		return check_Out_Date;
	}

	public WebElement getAdults_Per_Room() {
		return adults_Per_Room;
	}

	public WebElement getChildren_Per_Room() {
		return children_Per_Room;
	}
	public WebElement getSearch_Button() {
		return search_Button;
	}
	
	
	
	
	

}
