package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[text()='Inpatient Ward']")).click();
		driver.findElement(By.id("loginButton")).click();
		String acURL = driver.getCurrentUrl();
		System.out.println(acURL);
		if(acURL.contains("home.page")) {
			System.out.println("Test Case Is Passed");
		}else {
			System.out.println("Test Case Is Failed");
		}

	}

}
