package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parenthandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[contains(@alt,'LinkedIn')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'Facebook')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'twitter')]")).click();
		driver.findElement(By.xpath("//*[contains(@alt,'youtube')]")).click();
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> hlist = new ArrayList<String>(handles);
		for(String e:hlist) {
			driver.switchTo().window(e);
			if(!e.equals(parenthandle)) {
				driver.switchTo().window(e).close();
				//driver.findElement(By.xpath("//*[@id='email-or-phone']")).sendKeys("abcd");
				}
		}
		
		
		}

}
