package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		firstName.sendKeys("More");
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		action.keyDown(firstName, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		Thread.sleep(2000);
		
		action.keyDown(lastName, Keys.CONTROL).sendKeys("v").build().perform();
		
			}

}
