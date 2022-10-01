package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Waitu {

	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement img = driver.findElement(By.xpath("//img[@alt='Sportsstore']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Sportsstore']")));
				
		String text = driver.findElement(By.xpath("//img[@alt='Sportsstore']")).getAttribute("src");
		/*
		 * Alert alert = driver.switchTo().alert(); alert.accept();
		 */
		System.out.println(text);

	}

}
