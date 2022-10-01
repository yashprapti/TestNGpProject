package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAndLinktextLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.className("form-control")).sendKeys("pandharpur-413304");

		//driver.findElement(By.partialLinkText("Voting Information Centre")).click();
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		
	}

}
