package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebuRao {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int colcount = driver.findElements(By.xpath("//*[@id='customers']//tr/th")).size();
		int rowcount =driver.findElements(By.xpath("//*[@id='customers']//tr")).size();
		boolean flag = false;
		for(int i=2;i<=rowcount;i++) {
			for(int j=1;j<=colcount;j++) {
				String tableData = driver.findElement(By.xpath("//*[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
				//System.out.print("  "+tableData+"  ");
				if(tableData.contains("Canada")) {
					flag = true;
					break;
				}
			}
			//System.out.println();
		}
		if(flag) {
			System.out.println("Test Is Passed");
		}else {
			System.out.println("Test Is Failed");
		}
		
	}

}
