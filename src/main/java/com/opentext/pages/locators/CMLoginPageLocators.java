package com.opentext.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CMLoginPageLocators {
	@FindBy(id = "loginUsername")
	public WebElement username;
	@FindBy(id = "loginPassword")
	public WebElement password;
	@FindBy(id = "loginSubmit")
	public WebElement loginButton;
	@FindBy(xpath = "//*[@id=\"message-box-btn-ok\"]/div")
	public WebElement okButton;

}
