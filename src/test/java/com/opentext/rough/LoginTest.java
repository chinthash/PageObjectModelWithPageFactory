package com.opentext.rough;

import com.opentext.base.Page;
import com.opentext.pages.actions.CMLoginPage;

public class LoginTest {
	public static String username = "admin";
	public static String password = "admin";

	public static void main(String args[]) {
		Page.initConfiguration();
		CMLoginPage p = new CMLoginPage();
		p.logInAsAdmin(username, password);
		Page.quitBrowser();
	}
}
