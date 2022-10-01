package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormControl {
	
	static ChromeDriver driver;
	
	public static void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		}else if(gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//*[@for='gender-radio-2']")).click();
		}else {
			driver.findElement(By.xpath("//*[@for='gender-radio-3']")).click();
		}
	}
	
	

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
		/*
		 * selectGender("male"); Thread.sleep(2000); selectGender("other");
		 */
		int noOfCheckboxes = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println("No. Of Checkboxes are : "+noOfCheckboxes);
		for(int i=1;i<=noOfCheckboxes;i++) {
			driver.findElement(By.xpath("//*[@type='checkbox']["+i+"]")).click();
		}
		String number = driver.findElement(By.xpath("//*[@name='num']")).getText();
		System.out.println(number);
	}

}
