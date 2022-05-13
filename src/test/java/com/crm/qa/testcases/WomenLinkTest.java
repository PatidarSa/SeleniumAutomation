package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.WomenLinkPage;


public class WomenLinkTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	WomenLinkPage womenpage;
	
	
	public WomenLinkTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		womenpage = new WomenLinkPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		womenpage=homePage.clickOnWomenLink();
	}
	
	@Test(priority=1)
	
	public void verifyWomentextTest()
	
	{
		Assert.assertTrue(womenpage.verifyWomentext(),"label is missing on page");;
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
