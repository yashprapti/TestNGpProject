package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		//driver.get("https://www.facebook.com/login.php/");
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/form/div/div/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.className("rct-icon-uncheck")).click();
	}

}
