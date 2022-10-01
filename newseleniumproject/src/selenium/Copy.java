package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement fn = driver.findElement(By.id("firstName"));
		WebElement ln = driver.findElement(By.id("lastName"));
		fn.sendKeys("More");
		Actions action = new Actions(driver);
		action.keyDown(fn, Keys.CONTROL).sendKeys("a").sendKeys("x").build().perform();
		action.keyDown(ln, Keys.CONTROL).sendKeys("v").build().perform();
		
		

	}

}
