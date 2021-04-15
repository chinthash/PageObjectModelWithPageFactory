package com.opentext.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.opentext.base.Page;
import com.opentext.pages.locators.CMAdminHomePageLocators;

public class CMAdminHomePage {

	public CMAdminHomePageLocators adminhomepage;

	public CMAdminHomePage() {
		this.adminhomepage = new CMAdminHomePageLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(ajax, adminhomepage);
	}

	public CMAdminUsersPage clickAddUserIcon() {
		Page.click(adminhomepage.addusericon);
		return new CMAdminUsersPage();
	}

	public void gotoUsers() {
		Page.click(adminhomepage.users);

	}

	public void gotoSettings() {
		Page.click(adminhomepage.settings);
	}

}
