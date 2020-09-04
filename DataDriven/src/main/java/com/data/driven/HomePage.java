package com.data.driven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseTest {
	
	@FindBy(xpath="//h1[text()='Welcome to Shoppersdrobe']")
	WebElement homePageText;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	public String getHomePageText() {
		return homePageText.getText();
	}
	
	public void clickOnLogin() {
		loginButton.click();
	}

}
