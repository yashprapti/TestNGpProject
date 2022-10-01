package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	//*[@type='checkbox'][4]
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
			driver.findElements(By.xpath("//*[@type='checkbox']"));
			/*
			 * for(int i=1;i<=checkboxes;i++) {
			 * driver.findElement(By.xpath("//*[@type='checkbox']["+i+"]")).click(); }
			 */
			
			/*
			 * System.out.println("No of Checkboxes : "+checkboxes); String noOfCheckboxes =
			 * String.valueOf(checkboxes); // Converts int into String
			 * if(noOfCheckboxes.equals("100")) { System.out.println("Test Case is Passed");
			 * }else { System.out.println("Test Case is failed"); }
			 */
	}

}
