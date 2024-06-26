package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel_Page {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_Name;
	
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement last_Name;
	
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement billing_Adress;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement credit_Card_No;
	
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement credit_Card_Type;
	
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private WebElement exp_Month;
	
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement exp_yrs;

	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement book_Now;
	
	public Book_A_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getBilling_Adress() {
		return billing_Adress;
	}

	public WebElement getCredit_Card_No() {
		return credit_Card_No;
	}

	public WebElement getCredit_Card_Type() {
		return credit_Card_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_yrs() {
		return exp_yrs;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_Now() {
		return book_Now;
	}
	
	
	
	
	
	

}
