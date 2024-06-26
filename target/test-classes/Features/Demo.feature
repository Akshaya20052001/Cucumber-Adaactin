Feature: Hotel Booking Functionality In Adactin Hotel Application
@sc1
Scenario: Login Page
Given user Launch The Adactin Url
When user Enter The Username In The Username Field
And  user Enter The Password In The Password Field
Then user Click On The Loginbutton Which Navigates The User To Search Hotel Page

@sc2
 Scenario: Search Hotel Page
  When user Select The Location In The Location DropDown
  And user Select The Hotels In The Hotels DropDown
  And user Select The Room Type In The Room Type DropDown
  And user Select The Number Of Rooms In The Number Of Rooms DropDown
  And user Enter The Check In Date In The Check In Date Field
  And user Enter The Check Out Date In The Check Out Date Field
  And user Select The Number Of Adults In The Adults Per Room DropDown
  And user Select The Number Of Children In The Children Per Room DropDown
  Then user Click On The SearchButton Which Navigates To Select Hotel Page
 
 @sc3
Scenario: Select Hotel Page
  When user Select The RadioButton Which Mentions The Available Hotel Based On Previous Selections
  And user Click On The ContinueButton Which Navigates To Book A Hotel Page
 
 @sc4
Scenario: Book A Hotel Page  
  When user Enter The First Name In The First Name Field
  And user Enter The Last Name In The Last Name Field
  And user Enter Their Address In The Billing Address Field
  And user Enter Their Sixteen Digit  Credit Card Number In The Credit Card Number Field
  And user Select The Credit Card Type From The Credit Card Type DropDown
  And user Select The Credit Card Expiry Month And Expiry Year From The Expiry Date DropDown
  And user Enter The Credit Card CVV Number In The CVV Number Field
  Then user Click On The Book Now Button Which Navigates To Hotel Booking Confirm Page 
  And user Click On The Logout Button
  Then user Verify You Have Successfully Logged Out