package webelements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); -- Implicit
		
		
		//Explicit
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@alt='Sportsstore']")));
		
		
		//Fluent
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Sportsstore']")));
		
		String sportslink = driver.findElement(By.xpath("//img[@alt='Sportsstore']")).getAttribute("src");
		System.out.println(sportslink);

	}

}
