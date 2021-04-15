package com.opentext.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opentext.base.Page;
import com.opentext.pages.actions.CMLoginPage;

//Author schintha
public class TestLoginAsAdmin {
	public static String username = "admin";
	public static String password = "admin";

	@BeforeTest
	public void setup() {
		Page.initConfiguration();
	}

	@Test
	public void testLoginAsAdmin() {
		CMLoginPage p = new CMLoginPage();
		p.logInAsAdmin(username, password);
	}

	@AfterMethod
	public void cleanup() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}
}
