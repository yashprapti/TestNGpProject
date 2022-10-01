package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Ram");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		//driver.findElement(By.xpath("//*[@placeholder='Mobile Number']")).sendKeys("456123");
		
		//driver.findElement(By.xpath("//*[contains(@class,'subjects-auto-complete__placeholder')]")).sendKeys("xyz");
		driver.findElement(By.xpath("//*[text()='Inpatient Ward']")).click();
		driver.findElement(By.id("loginButton")).click();
		String actitle = driver.getTitle();
		System.out.println(actitle);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("Find Patient Record"));
		System.out.println(driver.findElement(By.xpath("//*[contains(@id,'referenceapplication-registrationapp-registerPatien')]")).getText());
	}

}
