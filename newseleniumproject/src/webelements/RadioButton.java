package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	static ChromeDriver driver ;
	
	public static void selectGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		}else if (gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//*[@for='gender-radio-2']")).click();	
		}else {
			driver.findElement(By.xpath("//*[@for='gender-radio-3']")).click();	
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		selectGender("male");
	}
}
