package agileTech.testNgFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AssertionInTestNG {
	
	public static WebDriver driver;
	
	@Test(groups="Sanity")
	public void verifyPage() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream(System.getProperty("user.dir")+
				"\\Configuration\\Config.properties");
		prop.load(fip);
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		SoftAssert sa = new SoftAssert();
		String exTitle = "ToolsQA";
		String exText = "Full Name";
		driver.get("https://demoqa.com/text-box");
		String acTitle = driver.getTitle();
		String acText = driver.findElement(By.xpath("//*[@id='userName-label']")).getText();
		sa.assertEquals(exTitle, acTitle,"Title Is Not Matching");
		sa.assertEquals(exText, acText,"Text Is Not Matching");
		System.out.println("Execution End");
		driver.close();
		sa.assertAll();
	}

}
