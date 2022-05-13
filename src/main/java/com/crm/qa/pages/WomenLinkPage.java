package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class WomenLinkPage extends TestBase{
	
	
	
	@FindBy(xpath="//span[@class='category-name']")
	WebElement womentext;
	
	public WomenLinkPage() {
		PageFactory.initElements(driver, this);
	}	
		
	public boolean verifyWomentext()
		
		{

		
			return womentext.isDisplayed();
			
		}
	}

