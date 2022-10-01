package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUppu {

	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		
		
		//using sendkeys method
		
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\LENOVO\\Desktop\\mydoc.pdf");
		
		//using Robot Class
		
		  WebElement button =
		  driver.findElement(By.xpath("//input[@id='file-upload']"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", button);
		  
		  //Use robot class
		  
		  Robot rb = new Robot();
		  rb.delay(2000);
		  
		  StringSelection ss = new StringSelection("C:\\Users\\LENOVO\\Desktop\\mydoc.pdf");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		  
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		 
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);
		  
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
