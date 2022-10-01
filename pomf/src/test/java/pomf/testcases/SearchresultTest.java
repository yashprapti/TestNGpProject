package pomf.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjects.IndexPage;
import com.pageobjects.SearchresultPage;
import com.pomf.base.BaseClass;

public class SearchresultTest extends BaseClass {
	
IndexPage indexpage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyString() {
		indexpage = new IndexPage();
		SearchresultPage searchresultpage = indexpage.searchProduct("tshirt");
		boolean result = searchresultpage.validateString();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyproduct() {
		System.out.println("ProductName");
	}

}
