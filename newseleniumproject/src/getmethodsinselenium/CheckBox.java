package getmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	static ChromeDriver driver;
	
	public static String firstXpath = "//*[@value='";
	
	public static String secondXpath = "']";
	
	public static void selectFavouriteColor(String color) {
		driver.findElement(By.xpath(firstXpath+color+secondXpath)).click();
		}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		selectFavouriteColor("green");
		selectFavouriteColor("yellow");
		selectFavouriteColor("red");
	}

}
