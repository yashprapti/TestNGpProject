package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWeb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\AgileTechSessions\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");

	}

}
