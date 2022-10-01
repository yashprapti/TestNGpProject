package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sematic {
	
	static ChromeDriver driver;
	
	public static void selectMyFriend(String myFriendName) {
		int noOfFriends = driver.findElements(By.xpath("//*[@class='menu transition visible']/div")).size();
		for(int i=1;i<=noOfFriends;i++) {
			String friendName = driver.findElement(By.xpath("//*[@class='menu transition visible']/div["+i+"]")).getText();
			if(friendName.contains(myFriendName)) {
				driver.findElement(By.xpath("//*[@class='menu transition visible']/div["+i+"]")).click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElement(By.xpath("//*[@class='ui fluid selection dropdown']")).click();
		Thread.sleep(1000);
		selectMyFriend("Matt");
		
	}

}
