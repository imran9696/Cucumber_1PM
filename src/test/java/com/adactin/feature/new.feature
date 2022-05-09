Feature: Booking Hotel In Adactin Application

Scenario: 
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Scenario:
When user Select Location In Location Field
And user Slect Hotel In Hotel Field
And user Select Room Type
And user Select Number Of Rooms
And user Enter The Date Check In Date Field
And user Enter The Date Check Out Date Field
And user Select Adults Per Room
And user Select Children Per Room
Then user Click Search Button And It Navigates To Select Hotel Page

Scenario:
When user Select Hotel By Click The Radio Button
Then user Click Continue Button And It Navigates To Book Hotel Page

Scenario:
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card Number Field
And user Select Credit Card Type
And user Select Expiry Month In Expiry Date Field
And user Select Expiry Year In Expiry Date Field
And user Enter The CVV Number In CVV Number Field
Then user Click The Book Now Button And It Navigates To Booking Confirm Page

Scenario:
Then user Click Logout Button And It Successfully Logged Out
