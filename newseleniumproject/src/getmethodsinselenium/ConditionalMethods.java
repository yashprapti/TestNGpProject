package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://phptravels.com/demo");
		boolean flag = driver.findElement(By.xpath("//*[@id='demo']")).isEnabled();
		System.out.println(flag);
		driver.close();		
		//driver.navigate().to("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		/*
		 * boolean flag =
		 * driver.findElement(By.xpath("//*[@value='red']")).isDisplayed(); boolean
		 * flag1 = driver.findElement(By.xpath("//*[@value='red']")).isEnabled();
		 * boolean flag2 =
		 * driver.findElement(By.xpath("//*[@value='red']")).isSelected();
		 */
		/*
		 * System.out.println(flag); System.out.println(flag1);
		 * System.out.println(flag2);
		 */
					
		/*
		 * boolean flag3 =
		 * driver.findElement(By.xpath("//*[@value='IE']")).isSelected();
		 * System.out.println(flag3); driver.close();
		 */

	}

}
