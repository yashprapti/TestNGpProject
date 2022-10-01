package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.Action;
import com.pomf.base.BaseClass;

public class SearchresultPage extends BaseClass {
	
	Action action = new Action();
	
	@FindBy(xpath="//*[contains(text(),'0 results have been found.')]")
	WebElement textString;
	
	public SearchresultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateString() {
		return action.isDisplayed(driver, textString);
	}
}
