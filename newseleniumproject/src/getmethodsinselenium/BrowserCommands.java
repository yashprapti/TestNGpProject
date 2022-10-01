package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[contains(@alt,'LinkedIn')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'Facebook')]")).click();
		driver.quit();
		}

}
