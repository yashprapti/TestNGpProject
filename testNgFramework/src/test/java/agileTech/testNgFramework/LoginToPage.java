package agileTech.testNgFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginToPage {
	
	
	@Test(dataProvider="dataSet",dataProviderClass=MyDataProvider.class)
	
	public void loginTestCase(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String exURL = "https://demo.openmrs.org/openmrs/referenceapplication/home.page";
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//li[text()='Inpatient Ward']")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String acURL = driver.getCurrentUrl();
		Assert.assertEquals(exURL, acURL);
	}
	
	

}
