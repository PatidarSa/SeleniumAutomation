package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	WebElement SignIN;
	

	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	WebElement Sign;
	
	@FindBy(xpath="(//img[@alt='My Store'])[1]")
	WebElement logo;
	
	//constructor
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	

	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateImage(){
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pw)
	
	{
		SignIN.click();
		Email.sendKeys(un);
		Password.sendKeys(pw);
		Sign.click();
		
		return new HomePage();
	}


	
	
	}

