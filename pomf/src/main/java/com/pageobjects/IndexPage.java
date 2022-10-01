/**
 * 
 */
package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiondriver.Action;
import com.pomf.base.BaseClass;

public class IndexPage extends BaseClass {
	
	Action action = new Action();
	
	@FindBy(xpath="//*[@class='logo img-responsive']")
	WebElement mySiteLogo;
	
	@FindBy(id="search_query_top")
	WebElement productsearchBox;
	
	@FindBy(name="submit_search")
	WebElement searchBtn;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		return action.isDisplayed(driver, mySiteLogo);
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public SearchresultPage searchProduct(String productName) {
		action.type(productsearchBox, productName);
		action.click(driver, searchBtn);
		return new SearchresultPage();
	}
}
