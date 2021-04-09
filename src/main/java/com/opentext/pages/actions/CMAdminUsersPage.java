package com.opentext.pages.actions;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.opentext.base.Page;
import com.opentext.pages.locators.CMAdminUsersPageLocators;

public class CMAdminUsersPage {
	public CMAdminUsersPageLocators userspage;

	public CMAdminUsersPage() {
		this.userspage = new CMAdminUsersPageLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(ajax, userspage);
	}

	public void createUser(Hashtable<String, String> data) throws InterruptedException {
		userspage.username.sendKeys(data.get("username"));
		userspage.displayame.sendKeys(data.get("displayname"));
		userspage.password.sendKeys(data.get("password"));
		userspage.repeatpassword.sendKeys(data.get("password"));
		if (data.get("contentwrite").equals("Y")) {
			userspage.contentwrite.click();
		}
		Thread.sleep(1000);
		if (data.get("contentread").equals("Y")) {
			userspage.contentread.click();
		}
		Thread.sleep(1000);
		if (data.get("contentsettingsread").equals("Y")) {
			userspage.contentsettingsread.click();
		}
		Thread.sleep(1000);
		if (data.get("contentsettingswrite").equals("Y")) {
			userspage.contentsettingswrite.click();
		}
		Thread.sleep(1000);
		if (data.get("technicalsettingsread").equals("Y")) {
			userspage.technicalsettingsread.click();
		}
		Thread.sleep(1000);
		if (data.get("technicalsettingswrite").equals("Y")) {
			userspage.technicalsettingswrite.click();
		}
		Thread.sleep(1000);
		if (data.get("transporter").equals("Y")) {
			userspage.transporter.click();
		}
		Thread.sleep(1000);
		if (data.get("automationtesttenant").equals("Y")) {
			userspage.automationtesttenant.click();
		}
		Thread.sleep(1000);
		if (data.get("demotenant").equals("Y")) {
			userspage.demotenant.click();
		}
		Thread.sleep(1000);
		if (data.get("esignaturetenant").equals("Y")) {
			userspage.esignaturetenant.click();
		}
		Thread.sleep(1000);
		if (data.get("initialmandant").equals("Y")) {
			userspage.initialmandant.click();
		}
		Thread.sleep(1000);
		if (data.get("sapdemo").equals("Y")) {
			userspage.sapdemo.click();
		}
		Thread.sleep(1000);
		if (data.get("testtenant").equals("Y")) {
			userspage.testtenant.click();
		}
		Thread.sleep(1000);
		userspage.createbutton.click();
		Thread.sleep(3000);

	}

}
