package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://demoqa.com/text-box");
		obj.findElement(By.id("userName")).sendKeys("ABCD");
	}

}
