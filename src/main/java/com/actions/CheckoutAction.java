package com.actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.locators.Checkout;
import com.utils.CustomKeywords;
import com.utils.HelperClass;

public class CheckoutAction extends CustomKeywords{
	public String productName;
	Checkout checkout = new Checkout();
	
	public CheckoutAction() {
		this.checkout = new Checkout();
		PageFactory.initElements(HelperClass.getDriver(), checkout);
	}
	
	public String getProductName() {
		productName = checkout.allProduct.get(0).getText();
		return productName;
	}
	
	public void clickCartButton() {
		for(int i=0;i<checkout.allProduct.size();i++) {
			if(checkout.allProduct.get(i).getText().equalsIgnoreCase(productName)) {
				customClick(checkout.allButtonAddToCart.get(i));
				break;
			}
		}
	}
	
	public void clickShoopingCart() {
		customClick(checkout.div_shoopingCart);
	}
	
	public void verifiesProductName() {
		Assert.assertEquals(productName, checkout.div_productName.getText());
	}
	
	public void clickCheckoutButton() {
		customClick(checkout.button_checkOut);
	}
	
	public void entersFirstName(String firstName) {
		checkout.input_firstName.sendKeys(firstName);
	}
	
	public void entersLastName(String lastName) {
		checkout.input_lastName.sendKeys(lastName);
	}
	
	public void entersPostalCode(String postalCode) {
		checkout.input_postalCode.sendKeys(postalCode);
	}
	
	public void clickContinueButton() {
		customClick(checkout.button_continue);
	}
	
	public void clickFinishButton() {
		customClick(checkout.button_finish);
	}
	
	public void verifiesSuccessfullyCheckedOut() {
		Assert.assertEquals("Thank you for your order!", checkout.h_complete_header.getText());
	}
}
