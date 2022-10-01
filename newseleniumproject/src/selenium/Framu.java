package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framu {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		WebElement frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame);
		String text = driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		String classname = driver.findElement(By.xpath("//*[text()='Nested Frames']")).getAttribute("class");
		System.out.println(classname);
	}

}
