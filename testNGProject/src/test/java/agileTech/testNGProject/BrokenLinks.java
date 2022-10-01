package agileTech.testNGProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	@Test
	public void searchBrokenLinks() throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement e:allLinks) {
			try {
				String Link = e.getAttribute("href");
				System.out.println(Link);
				HttpURLConnection huc = (HttpURLConnection)(new URL(Link).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int resCode = huc.getResponseCode();
				if(resCode>=400) {
					System.out.println(Link+" --Is Invalid Link");
				}else {
					System.out.println(Link+" --Is Valid Link");
				}
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ProtocolException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
