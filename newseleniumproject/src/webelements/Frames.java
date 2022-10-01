package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@src='/sample']"));
		driver.switchTo().frame(frame1); //2--> index,, frame1 --> id,, frame1 --> webelement
		String text = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		String className = driver.findElement(By.xpath("//div[text()='Frames']")).getAttribute("class");
	    System.out.println(className);
		
	}

}
