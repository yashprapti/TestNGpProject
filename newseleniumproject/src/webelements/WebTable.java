package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowcount = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
		int colcount = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th")).size();
		boolean flag = false;
		aa:for (int i = 2; i <= rowcount; i++) {
			for (int j = 1; j <= colcount; j++) {
				String tableData = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				if(tableData.contains("UK-USA")) {
					flag = true;
					break aa;
				}
			}			
		}
		if(flag) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case False");
		}

	}

}
