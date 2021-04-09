package com.opentext.testcases;

import org.testng.annotations.Test;

import com.opentext.base.Page;
import com.opentext.pages.actions.CMLoginPage;

public class TestLoginAsAdmin {
	public static String username = "admin";
	public static String password = "admin";
	@Test
	public void testLoginAsAdmin() {
		Page.initConfiguration();
		CMLoginPage p = new CMLoginPage();
		p.logInAsAdmin(username, password);
		Page.quitBrowser();
	}
}
