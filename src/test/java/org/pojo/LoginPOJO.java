package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {

	public LoginPOJO() {

		PageFactory.initElements(d, this);
	}

	@FindBy(id = "email")
	private WebElement user;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(id = "u_0_b")
	private WebElement button;
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgetlink;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getButton() {
		return button;
	}
	public WebElement getForgetlink() {
		return forgetlink;
	}

}
