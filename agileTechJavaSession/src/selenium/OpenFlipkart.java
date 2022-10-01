package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFlipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}

}
