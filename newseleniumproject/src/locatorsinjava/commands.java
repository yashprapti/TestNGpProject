package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {
	
	static ChromeDriver driver;
	
	public static  String firstXpath = "//*[@value='";
	public static  String secondXpath = "']";
	
	public static void pickMyFavioriteColor(String color){
	
		driver.findElement(By.xpath(firstXpath+color+secondXpath)).click();
	}

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		pickMyFavioriteColor("red");
		pickMyFavioriteColor("yellow");
		
		/*
		 * driver.navigate().to("https://su.digitaluniversity.ac/");
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh();
		 */
		//driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();
		//driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
		/*
		 * System.out.println(driver.findElement(By.
		 * xpath("//input[@name='browser' and @value='IE']")).isDisplayed());
		 * System.out.println(driver.findElement(By.
		 * xpath("//input[@name='browser' and @value='IE']")).isSelected());
		 * System.out.println(driver.findElement(By.
		 * xpath("//input[@name='browser' and @value='IE']")).isEnabled());
		 */
		
		
	}

}
