package webelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.html-code-generator.com/html/drop-down/country-names");
		// Steps for select type dropdown
		WebElement drpdwn = driver.findElement(By.id("condi")); // 1. find dropdown element and store it in webelement
		Select select = new Select(drpdwn); //2. create the object of select class
		//select.selectByVisibleText("Asia");//3. select the required -- select by visible text
		//select.selectByValue("EU");
		//select.selectByIndex(5);
		// How to check no of options
		/*
		 * List<WebElement> alloptions = select.getOptions(); int noOfOptions =
		 * alloptions.size();
		 * System.out.println("No of options in drop down are: "+noOfOptions);
		 */
	// How to check drop down options are sorted or not	
		
		List<WebElement> alloptions = select.getOptions();
		ArrayList<String> originalList = new ArrayList();
		//ArrayList<String> FirstList = new ArrayList();
		//ArrayList<String> FirstList = originalList;
		for(WebElement e:alloptions) {
			String optionText = e.getText();
			originalList.add(optionText);
		}
		System.out.println("List Before sorting : "+originalList);
		List<String> tempList = new ArrayList(originalList);
		Collections.sort(originalList);
		boolean flag = originalList.equals(tempList);
		System.out.println(flag);
	}

}
