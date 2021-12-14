package com.opentext.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.opentext.base.Page;
import com.opentext.pages.actions.CMAdminHomePage;
import com.opentext.pages.actions.CMAdminUsersPage;
import com.opentext.pages.actions.CMLoginPage;
import com.opentext.utilities.Utilities;

public class TestCreateUsers {

	public static String adminusername = "admin";
	public static String adminpassword = "admin";

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void testCreateUsers(Hashtable<String, String> data) throws InterruptedException {
		if (data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("Skipping testcase as runmode is No");
		}
		Page.initConfiguration();
		CMLoginPage login = new CMLoginPage();
		CMAdminHomePage homepage = login.logInAsAdmin(adminusername, adminpassword);
		CMAdminUsersPage userpage = homepage.clickAddUserIcon();
		userpage.createUser(data);

	}

	@AfterMethod
	public void cleanup() {

		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}

}
