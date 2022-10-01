package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonSelectDropDown {
	
	
	
	static ChromeDriver driver;
	
	public static void selectFriend(String myFriendName,String xpath) {
		int noOfFriends = driver.findElements(By.xpath(xpath)).size();
		for(int i=1;i<=noOfFriends;i++) {
			String friendName =  driver.findElement(By.xpath(xpath +"["+i+"]")).getText();
			if(friendName.contains(myFriendName)) {
				driver.findElement(By.xpath(xpath +"["+i+"]")).click();
				break;
			}
		}
	}
	
	//*[@class='menu transition visible']/div[5]

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElement(By.xpath("//*[@class='ui fluid selection dropdown']")).click();
		Thread.sleep(1000);
		selectFriend("Stevie","//*[@class='menu transition visible']/div");
		}

}
