package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.janmatithi.in/");
		driver.findElement(By.id("bdate")).click();
		
		WebElement yeardrp = driver.findElement(By.xpath("//*[@title='Change the year']"));
		Select select = new Select(yeardrp);
		select.selectByVisibleText("1988");
		
		Thread.sleep(5000);

		WebElement monthdrp = driver.findElement(By.xpath("//*[@title='Change the month']"));
		Select select1 = new Select(monthdrp);
		select1.selectByVisibleText("May");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='17']")).click();
		
	}

}
