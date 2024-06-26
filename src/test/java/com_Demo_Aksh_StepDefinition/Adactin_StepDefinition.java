package com_Demo_Aksh_StepDefinition;

import java.time.Duration;

import org.Base.Base_Class;
import org.Pom.Book_A_Hotel_Page;
import org.Pom.Booking_Confirmation_Page;
import org.Pom.Login_Page;
import org.Pom.Search_Hotel_Page;
import org.Pom.Select_Hotel_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com_Aksh_Runner.Adactin_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_StepDefinition extends Base_Class  {
	
	 public static WebDriver driver = Adactin_Runner.driver;
	
	public static Login_Page a = new Login_Page(driver);
	public static Search_Hotel_Page b = new Search_Hotel_Page(driver);
	public static Select_Hotel_Page c = new Select_Hotel_Page(driver);
	public static Book_A_Hotel_Page d = new Book_A_Hotel_Page(driver);
	public static Booking_Confirmation_Page e = new Booking_Confirmation_Page(driver);
	
	
	@Given("user Launch The Adactin Url")
	public void user_launch_the_adactin_url() {
	    driver.get("https://adactinhotelapp.com/");
	}
	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
	   send_keys(a.getUsername(), "sathishece4");
	  
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
	    send_keys(a.getPassword(), "Password1");
	}
	@Then("user Click On The Loginbutton Which Navigates The User To Search Hotel Page")
	public void user_click_on_the_loginbutton_which_navigates_the_user_to_search_hotel_page() {
		 click(a.getLogin()); 
	}
	
	@When("user Select The Location In The Location DropDown")
	public void user_select_the_location_in_the_location_drop_down() {
	    click(b.getLocation());
	    select_By_Index(b.getLocation(), 3);
	    
	}
	@When("user Select The Hotels In The Hotels DropDown")
	public void user_select_the_hotels_in_the_hotels_drop_down() {
		click(b.getHotel());
		select_By_Value(b.getHotel(), "Hotel Hervey");
	  
	}
	@When("user Select The Room Type In The Room Type DropDown")
	public void user_select_the_room_type_in_the_room_type_drop_down() {
		click(b.getRoom_Type());
	    select_By_Index(b.getRoom_Type(), 0);
	}
	@When("user Select The Number Of Rooms In The Number Of Rooms DropDown")
	public void user_select_the_number_of_rooms_in_the_number_of_rooms_drop_down() {
	   select_By_Index(b.getNumber_Of_Rooms(), 3);
	}
	@When("user Enter The Check In Date In The Check In Date Field")
	public void user_enter_the_check_in_date_in_the_check_in_date_field() {
	    send_keys(b.getCheck_In_Date(), "21/06/2024");
	}
	@When("user Enter The Check Out Date In The Check Out Date Field")
	public void user_enter_the_check_out_date_in_the_check_out_date_field() {
	    send_keys(b.getCheck_Out_Date(), "22/06/2024");
	}
	@When("user Select The Number Of Adults In The Adults Per Room DropDown")
	public void user_select_the_number_of_adults_in_the_adults_per_room_drop_down() {
	   select_By_Index(b.getAdults_Per_Room(), 2);
	}
	@When("user Select The Number Of Children In The Children Per Room DropDown")
	public void user_select_the_number_of_children_in_the_children_per_room_drop_down() {
		select_By_Index(b.getChildren_Per_Room(), 3);
	   
	}
	@Then("user Click On The SearchButton Which Navigates To Select Hotel Page")
	public void user_click_on_the_search_button_which_navigates_to_select_hotel_page() {
	    click(b.getSearch_Button());
	}

	@When("user Select The RadioButton Which Mentions The Available Hotel Based On Previous Selections")
	public void user_select_the_radio_button_which_mentions_the_available_hotel_based_on_previous_selections() throws InterruptedException {
//	   Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		click(c.getRadio_button());	
	}
	
	@When("user Click On The ContinueButton Which Navigates To Book A Hotel Page")
	public void user_click_on_the_continue_button_which_navigates_to_book_a_hotel_page() {
	    click(c.getContinue_Button());
	}

	@When("user Enter The First Name In The First Name Field")
	public void user_enter_the_first_name_in_the_first_name_field() {
	    send_keys(d.getFirst_Name(), "Akshaya");
	}
	@When("user Enter The Last Name In The Last Name Field")
	public void user_enter_the_last_name_in_the_last_name_field() {
	   
		send_keys(d.getLast_Name(), "Pandiyan");
	}
	@When("user Enter Their Address In The Billing Address Field")
	public void user_enter_their_address_in_the_billing_address_field() {
	    send_keys(d.getBilling_Adress(), "Csk nagar");
	}
	@When("user Enter Their Sixteen Digit  Credit Card Number In The Credit Card Number Field")
	public void user_enter_their_sixteen_digit_credit_card_number_in_the_credit_card_number_field() {
	    send_keys(d.getCredit_Card_No(), "1234567890123456");
	}
	@When("user Select The Credit Card Type From The Credit Card Type DropDown")
	public void user_select_the_credit_card_type_from_the_credit_card_type_drop_down() {
		select_By_Index(d.getCredit_Card_Type(), 2);
	    
	}
	@When("user Select The Credit Card Expiry Month And Expiry Year From The Expiry Date DropDown")
	public void user_select_the_credit_card_expiry_month_and_expiry_year_from_the_expiry_date_drop_down() {
		select_By_Index(d.getExp_Month(), 3);
		select_By_Index(d.getExp_yrs(), 5);
	}
	@When("user Enter The Credit Card CVV Number In The CVV Number Field")
	public void user_enter_the_credit_card_cvv_number_in_the_cvv_number_field() {
		send_keys(d.getCvv(), "123");
	    
	}
	@Then("user Click On The Book Now Button Which Navigates To Hotel Booking Confirm Page")
	public void user_click_on_the_book_now_button_which_navigates_to_hotel_booking_confirm_page() {
	    click(d.getBook_Now());
	}
	@Then("user Click On The Logout Button")
	public void user_click_on_the_logout_button() {
	    click(e.getLogout());
	}
	@Then("user Verify You Have Successfully Logged Out")
	public void user_verify_you_have_successfully_logged_out() {
		isDisplyed(e.getConfirmation_Msg());
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
