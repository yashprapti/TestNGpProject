package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[text()='Inpatient Ward']")).click();
		driver.findElement(By.id("loginButton")).click();
		/*
		 * String sourceCode = driver.getPageSource(); System.out.println(sourceCode);
		 * if(sourceCode.contains("Register a patient")) {
		 * System.out.println("Test Case Is Passed"); }else {
		 * System.out.println("Test Case Is Failed"); }
		 */
		String actext = driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).getText();
		
		if(actext.equals("Logout")) {
			System.out.println("Test Case Is Passed");
		}else {
			System.out.println("Test Case Is Failed");
		}	
		driver.close();
	
	}

}
