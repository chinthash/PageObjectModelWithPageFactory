package com.opentext.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CMAdminUsersPageLocators {

	@FindBy(id = "input-user-id-input")
	public WebElement username;
	@FindBy(id = "input-user-display-name-input")
	public WebElement displayame;
	@FindBy(id = "input-password-input")
	public WebElement password;
	@FindBy(id = "input-password-repeat-input")
	public WebElement repeatpassword;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[2]/td[1]/div/div")
	public WebElement contentwrite;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[3]/td[1]/div/div")
	public WebElement contentread;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[4]/td[1]/div/div")
	public WebElement contentsettingsread;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[5]/td[1]/div/div")
	public WebElement contentsettingswrite;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[6]/td[1]/div/div")
	public WebElement technicalsettingsread;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[7]/td[1]/div/div")
	public WebElement technicalsettingswrite;
	@FindBy(xpath = "//*[@id=\"grid-user-permissions\"]/div[2]/div/table/tbody[2]/tr[8]/td[1]/div/div")
	public WebElement transporter;
	@FindBy(xpath = "//*[@id=\"grid-user-tenants\"]/div[2]/div/table/tbody[2]/tr[1]/td[1]/div/div")
	public WebElement automationtesttenant;
	@FindBy(xpath = "//*[@id=\"grid-user-tenants\"]/div[2]/div/table/tbody[2]/tr[2]/td[1]/div/div")
	public WebElement demotenant;
	@FindBy(xpath = "//*[@id=\"grid-user-tenants\"]/div[2]/div/table/tbody[2]/tr[3]/td[1]/div/div")
	public WebElement esignaturetenant;
	@FindBy(xpath = "//*[@id=\"grid-user-tenants\"]/div[2]/div/table/tbody[2]/tr[4]/td[1]/div/div")
	public WebElement initialmandant;
	@FindBy(xpath = "//*[@id=\"grid-user-tenants\"]/div[2]/div/table/tbody[2]/tr[5]/td[1]/div/div")
	public WebElement sapdemo;
	@FindBy(xpath = "//*[@id=\"grid-user-tenants\"]/div[2]/div/table/tbody[2]/tr[6]/td[1]/div/div")
	public WebElement testtenant;
	@FindBy(xpath = "//*[@class=\"html-face\" and text()=\"Create\"]")
	public WebElement createbutton;

}
