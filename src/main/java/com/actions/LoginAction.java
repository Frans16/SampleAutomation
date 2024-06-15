package com.actions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.locators.Login;
import com.utils.CustomKeywords;
import com.utils.HelperClass;

public class LoginAction extends CustomKeywords{
	Login login = new Login();
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	
	public LoginAction() {
		this.login = new Login();
		PageFactory.initElements(HelperClass.getDriver(), login);
	}
	
	public void entersUsername(String username) {
		login.inputUsername.sendKeys(username);
	}
	
	public void entersPassword(String password) {
		login.inputPassword.sendKeys(password);
	}
	
	public void clicksLogin() {
		customClick(login.buttonLogin);
	}
	
	public void verifiesProductSite() {
		Assert.assertEquals(true, isElementPresent(login.spanProduct));
	}
}
