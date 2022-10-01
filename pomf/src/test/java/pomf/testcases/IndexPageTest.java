/**
 * 
 */
package pomf.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pomf.base.BaseClass;
import com.pageobjects.IndexPage;
public class IndexPageTest extends BaseClass{
	
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
	public void verifyLogo() {
		indexpage = new IndexPage();
		boolean result = indexpage.validateLogo();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyTitle() {
		indexpage = new IndexPage();
		String actitle = indexpage.getTitle();
		Assert.assertEquals(actitle, "My Store");
	}
}
