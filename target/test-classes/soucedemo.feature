Feature: Souce Demo Automation Testing
	The scenario is used for an automation process on the Sauce Demo website, starting from login to checkout.
	
	
	Background: Open Page
		Given User is on login page "https://www.saucedemo.com/"
		
		
		Scenario: Login
			When User enters username as "standard_user"
			And User enters password as "secret_sauce"
			And User clicks login button
			Then User has successfully logged in
			
		Scenario: Checkout
			When User enters username as "standard_user"
			And User enters password as "secret_sauce"
			And User clicks login button
			And User clicks add to cart button
			And User clicks cart button
			And User verifes product name
			And User clicks checkout button
			And User enters checkout information
			And User clicks continue button
			And User clicks finish button
			Then User has successfully checked out