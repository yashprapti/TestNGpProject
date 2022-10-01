package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DetuRao {
	
	static ChromeDriver driver;
	
	public static void selectFromCalender(String xpath,String Details) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		Select select = new Select(ele);
		select.selectByVisibleText(Details);	
	}

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.janmatithi.in/");
		driver.findElement(By.id("bdate")).click();
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath("//*[@title='Change the year']")); Select select
		 * = new Select(ele); select.selectByVisibleText("1980"); WebElement ele1 =
		 * driver.findElement(By.xpath("//*[@title='Change the month']")); Select
		 * select1 = new Select(ele1); select1.selectByVisibleText("October");
		 */
		selectFromCalender("//*[@title='Change the year']", "1980");
		selectFromCalender("//*[@title='Change the month']", "October");
		driver.findElement(By.xpath("//a[text()='20']")).click();
		

	}

}
