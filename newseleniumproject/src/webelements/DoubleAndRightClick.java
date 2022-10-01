package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement dblbtn = driver.findElement(By.id("doubleClickBtn"));
		WebElement rhtbtn = driver.findElement(By.id("rightClickBtn"));
		
		Actions action = new Actions(driver);
		action.doubleClick(dblbtn).perform();
		Thread.sleep(1000);
		action.contextClick(rhtbtn).perform();
	}

}
