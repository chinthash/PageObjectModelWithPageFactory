package com.opentext.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CMAdminHomePageLocators {

	@FindBy(xpath = "//*[@id=\"btn-users\"]/div/div/div")
	public WebElement users;
	@FindBy(xpath = "//*[@id=\"btn-general-settings\"]/div/div")
	public WebElement settings;
	@FindBy(xpath = "//*[@id=\"btn-global-add\"]/div/div/div/img")
	public WebElement addusericon;

}
