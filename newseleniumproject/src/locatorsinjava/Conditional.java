package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://phptravels.com/demo");
		boolean flag = driver.findElement(By.xpath("//*[@id='demo']")).isEnabled();
		System.out.println(flag);
	}

}
