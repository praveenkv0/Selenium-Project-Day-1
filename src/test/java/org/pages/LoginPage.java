package org.pages;

import java.sql.Driver;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginMouseOver;
	
	@FindBy(xpath="//div[text()='Sign Up']")
	private WebElement signupButton;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement textBox;
	
	@FindBy(xpath="//div[text()='Realme Narzo 20 (Glory Sliver, 64 GB)']")
	private WebElement mobileSearch;
	
	@FindBy(xpath="//button[text()='NOTIFY ME']")
	private WebElement notifyButton;
	@FindBy(xpath="//button[text()='Deny']")
	private WebElement denyClick;
	

	public WebElement getMobileSearch() {
		return mobileSearch;
	}

	public WebElement getDenyClick() {
		return denyClick;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getInputSearch() {
		return mobileSearch;
	}

	public WebElement getNotifyButton() {
		return notifyButton;
	}

	public WebElement getLoginMouseOver() {
		return loginMouseOver;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
