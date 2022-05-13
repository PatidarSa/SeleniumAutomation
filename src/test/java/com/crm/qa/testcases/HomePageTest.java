package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.WomenLinkPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	WomenLinkPage womenpage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void LogoImageTest(){
		boolean flag = loginPage.validateImage();
		Assert.assertTrue(flag);
	}
	
	//View my customer account
	@Test(priority=2)
	public void clickOnWomenLinkTest()
	{
		womenpage = homePage.clickOnWomenLink();
				
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

	
	
	
}
