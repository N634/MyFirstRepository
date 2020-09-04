package com.data.driven;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenTest extends BaseTest{
	
	String expectedTitle = "Shoppersdrobe";
	String expectedText = "Welcome to Shoppersdrobe";
	@Test
	public void dataDrivenTest() throws IOException {
		Assert.assertEquals(getDriver().getTitle().toLowerCase(), expectedTitle.toLowerCase());
		HomePage hp = PageFactory.initElements(getDriver(), HomePage.class);
		Assert.assertTrue(hp.getHomePageText().equalsIgnoreCase(expectedText));
		SignIn si = PageFactory.initElements(getDriver(), SignIn.class);
		
		si.enterLoginData();
		si.signIn();
		si.logOut();
	}
	

}
