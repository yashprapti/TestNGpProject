package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement fashion = driver.findElement(By.xpath("//*[@alt='Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();
		WebElement kids =driver.findElement(By.xpath("//*[text()='Kids']"));
		action.moveToElement(kids).perform();
		kids.click();
		}

}
