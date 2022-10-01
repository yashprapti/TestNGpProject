package agileTech.testNGProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assertion {
	public static WebDriver driver;
	
	@Test(groups="Regression")
	public void verifyHomePage() throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+
				"\\Configuration\\Config.properties");
		prop.load(ip);
		WebDriverManager.chromedriver().setup();
    	String BrowserName=prop.getProperty("browser");
    	if(BrowserName.equalsIgnoreCase("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    	}else if(BrowserName.equalsIgnoreCase("firefox")) {
    		WebDriverManager.firefoxdriver().setup();
    		driver= new FirefoxDriver();
    	}else {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		//System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert sa = new SoftAssert();
		String exTitle = "ToolsQA";
		driver.get("https://demoqa.com/text-box");
		String acTitle = driver.getTitle();
		System.out.println(acTitle);
		sa.assertEquals(exTitle, acTitle,"Title is not matching with expected title");
		
		String exText = driver.findElement(By.xpath("//*[contains(text(),'Full Name')]")).getText();
		String acText  = "Full Name";
		sa.assertEquals(exText, acText,"Text is not found");
		driver.close();
		sa.assertAll();
		
	}
}
