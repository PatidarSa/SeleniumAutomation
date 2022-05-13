package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement username;
	
	@FindBy(xpath = "//a[@title='Women']")
	WebElement WomenLink;
	

	@FindBy(xpath = "(//a[@title='Dresses'][normalize-space()='Dresses'])[2]")
	WebElement DressesLink;

	@FindBy(xpath = "(//a[@title='T-shirts'][normalize-space()='T-shirts'])[2]")
	WebElement Tshirts;
	

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return username.isDisplayed();
	}
    
	public WomenLinkPage clickOnWomenLink(){
		WomenLink.click();
		return new WomenLinkPage();
	}
	
	
	public DressesLinkPage clickOnDressesLink(){
		DressesLink.click();
		return new DressesLinkPage();
	}
	
	public TshirtsPage clickOnTshirtsLink(){
		Tshirts.click();
		return new TshirtsPage();
	}
	
	
	
	
}
