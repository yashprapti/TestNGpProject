package com.pomf.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/*import com.mystore.actiondriver.Action;
import com.mystore.utility.ExtentManager;*/

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;

	@BeforeTest
	public static void loadConfig(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
    public static void launchApp() {
    	WebDriverManager.chromedriver().setup();
    	String BrowserName=prop.getProperty("browser");
    	if(BrowserName.equalsIgnoreCase("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    	}else if(BrowserName.equalsIgnoreCase("firefox")) {
    		WebDriverManager.firefoxdriver().setup();
    		driver= new FirefoxDriver();
    	}else {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
    	//Maximize the screen
    			driver.manage().window().maximize();
       			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       			driver.get(prop.getProperty("url"));
    }
 }
