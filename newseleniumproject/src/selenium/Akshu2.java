package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Akshu2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\AgileTechSessions\\geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver();
		 */
		driver.get("https://jqueryui.com/slider/");
		WebElement frame =driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		WebElement sliderHandle = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		//WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));

		//action.dragAndDrop(source, target).build().perform();
		action.dragAndDropBy(sliderHandle, 500, 0).build().perform();

	}

}
