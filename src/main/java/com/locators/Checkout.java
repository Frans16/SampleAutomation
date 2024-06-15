package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {
	@FindBy(xpath = "//div[@class='pricebar']/button")
	public List<WebElement> allButtonAddToCart;
	
	@FindBy(xpath = "//div[@class='inventory_item_name ']")
	public List<WebElement> allProduct;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	public WebElement div_shoopingCart;
	
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	public WebElement div_productName;
	
	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement button_checkOut;
	
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement input_firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement input_lastName;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	public WebElement input_postalCode;
	
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement button_continue;
	
	
	@FindBy(xpath = "//button[@id='finish']")
	public WebElement button_finish;
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	public WebElement h_complete_header;
}
