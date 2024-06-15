package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement inputUsername;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement inputPassword;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement buttonLogin;
	
	@FindBy(xpath = "//span[text()='Products']")
	public WebElement spanProduct;
}
