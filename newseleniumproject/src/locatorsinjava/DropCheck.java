package locatorsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropCheck {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drpdwn = driver.findElement(By.id("animals"));
		Select select = new Select(drpdwn);
		//select.selectByVisibleText("Big Baby Cat");
		//select.selectByValue("avatar");
		//select.selectByIndex(1);
		List<WebElement> alloptions = select.getOptions();
		int noOfOptions = alloptions.size();
		System.out.println(noOfOptions);
		List<String> originalList = new ArrayList();
		for(WebElement e :alloptions ) {
			String animalName = e.getText();
			originalList.add(animalName);
		}
		System.out.println(originalList);
		
		List<String> tempList = originalList;

		boolean flag = originalList.equals(tempList);
		System.out.println(flag);
		Collections.sort(tempList);
		System.out.println(tempList);

	}

}
