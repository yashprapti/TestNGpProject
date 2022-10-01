package webelements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parenthandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[contains(@alt,'LinkedIn')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'Facebook')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'twitter')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'youtube')]")).click();
		Set<String> allhandles = driver.getWindowHandles();
		for(String e:allhandles) {
			//String title = driver.switchTo().window(e).getTitle();
			if(!e.equals(parenthandle)) {
				driver.switchTo().window(e);
				driver.close();
				}
		}
				
	}

}
