Feature: Automation for souce demo site
	 Automation for login process

  Scenario: Login
    Given User is on login site "https://www.saucedemo.com/"
    When User enters username as "standard_user"
    And User enters password as "secret_sauce"
    And User clicks login button
    Then User has successfully logged in
