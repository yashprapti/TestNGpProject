package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\AgileTechSessions\\chromedriver.exe"); ChromeDriver driver = new
		 * ChromeDriver();
		 */

		System.setProperty("webdriver.gecko.driver", "D:\\AgileTechSessions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//*[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("I agree with T&C");
		Thread.sleep(5000);
		alert.accept();
	}

}
