package com.opentext.pages.actions;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.opentext.base.Page;
import com.opentext.pages.locators.CMAdminUsersPageLocators;

public class CMAdminUsersPage extends Page {
	public CMAdminUsersPageLocators userspage;

	public CMAdminUsersPage() {
		this.userspage = new CMAdminUsersPageLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, userspage);
	}

	public Boolean verifyUserPresence(String username) {
		for (int rowcount = 2; rowcount <= userspage.rows.size(); rowcount++) {

		}
		return true;

	}

	public void createUser(Hashtable<String, String> data) throws InterruptedException {
		type(userspage.username, data.get("username"));
		type(userspage.displayame, data.get("displayname"));
		type(userspage.password, data.get("password"));
		type(userspage.repeatpassword, data.get("password"));
		if (data.get("contentwrite").equals("Y")) {
			click(userspage.contentwrite);
		}
		Thread.sleep(1000);
		if (data.get("contentread").equals("Y")) {
			click(userspage.contentread);
		}
		Thread.sleep(1000);
		if (data.get("contentsettingsread").equals("Y")) {
			click(userspage.contentsettingsread);
		}
		Thread.sleep(1000);
		if (data.get("contentsettingswrite").equals("Y")) {
			click(userspage.contentsettingswrite);
		}
		Thread.sleep(1000);
		if (data.get("technicalsettingsread").equals("Y")) {
			click(userspage.technicalsettingsread);
		}
		Thread.sleep(1000);
		if (data.get("technicalsettingswrite").equals("Y")) {
			click(userspage.technicalsettingswrite);
		}
		Thread.sleep(1000);
		if (data.get("transporter").equals("Y")) {
			click(userspage.transporter);
		}
		Thread.sleep(1000);
		if (data.get("automationtesttenant").equals("Y")) {
			click(userspage.automationtesttenant);
		}
		Thread.sleep(1000);
		if (data.get("demotenant").equals("Y")) {
			click(userspage.demotenant);
		}
		Thread.sleep(1000);
		if (data.get("esignaturetenant").equals("Y")) {
			click(userspage.esignaturetenant);
		}
		Thread.sleep(1000);
		if (data.get("initialmandant").equals("Y")) {
			click(userspage.initialmandant);
		}
		Thread.sleep(1000);
		if (data.get("sapdemo").equals("Y")) {
			click(userspage.sapdemo);
		}
		Thread.sleep(1000);
		if (data.get("testtenant").equals("Y")) {
			click(userspage.testtenant);
		}
		Thread.sleep(1000);
		click(userspage.createbutton);
		Thread.sleep(3000);

	}

}
