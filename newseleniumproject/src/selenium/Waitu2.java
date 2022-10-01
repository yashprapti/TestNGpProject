package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitu2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */
		FluentWait wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class).until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Test Is Passed");
		

	}

}
