package com.opentext.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.opentext.base.Page;
import com.opentext.pages.locators.CMLoginPageLocators;

public class CMLoginPage extends Page {

	public CMLoginPageLocators login;

	public CMLoginPage() {
		this.login = new CMLoginPageLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, login);
	}

	public CMAdminHomePage logInAsAdmin(String username, String password) {
		login.username.sendKeys(username);
		login.password.sendKeys(password);
		login.loginButton.click();
		login.okButton.click();
		return new CMAdminHomePage();

	}
}
