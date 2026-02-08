package com.Ecommerce.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckobox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckobox() {
		return rememberMeCheckobox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void automateLoginFunctionality(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckobox.click();
		loginButton.click();
	}

}
