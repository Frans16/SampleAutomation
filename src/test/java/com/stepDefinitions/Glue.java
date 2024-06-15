package com.stepDefinitions;

import com.actions.CheckoutAction;
import com.actions.LoginAction;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Glue {
	LoginAction loginAction = new LoginAction();
	CheckoutAction checkoutAction = new CheckoutAction();
	
	@Given("User is on login page {string}")
	public void user_is_on_login_page(String siteUrl) {
	    HelperClass.openPage(siteUrl);
	}
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
	    loginAction.entersUsername(username);
	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	    loginAction.entersPassword(password);
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
	    loginAction.clicksLogin();
	}
	@Then("User has successfully logged in")
	public void user_has_successfully_logged_in() {
	    loginAction.verifiesProductSite();
	}
	
	
	@When("User clicks add to cart button")
	public void user_clicks_add_to_cart_button() throws InterruptedException {
		Thread.sleep(2000);
		checkoutAction.getProductName();
		System.out.println(checkoutAction.getProductName());
	    checkoutAction.clickCartButton();
	}
	@When("User clicks cart button")
	public void user_clicks_cart_button() throws InterruptedException {
		Thread.sleep(2000);
	    checkoutAction.clickShoopingCart();
	}
	@When("User verifes product name")
	public void user_verifes_product_name() throws InterruptedException {
		Thread.sleep(2000);
		checkoutAction.verifiesProductName();
	}
	@When("User clicks checkout button")
	public void user_clicks_checkout_button() throws InterruptedException {
		Thread.sleep(2000);
	    checkoutAction.clickCheckoutButton();
	}
	@When("User enters checkout information")
	public void user_enters_checkout_information() throws InterruptedException {
		Thread.sleep(2000);
	    checkoutAction.entersFirstName("Frans");
	    Thread.sleep(2000);
	    checkoutAction.entersLastName("QA");
	    Thread.sleep(2000);
	    checkoutAction.entersPostalCode("12920");
	}
	@When("User clicks continue button")
	public void user_clicks_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		checkoutAction.clickContinueButton();
	}
	@When("User clicks finish button")
	public void user_clicks_finish_button() throws InterruptedException {
		Thread.sleep(2000);
	    checkoutAction.clickFinishButton();
	}
	@Then("User has successfully checked out")
	public void user_has_successfully_checked_out() throws InterruptedException {
		Thread.sleep(2000);
	    checkoutAction.verifiesSuccessfullyCheckedOut();
	}
}
