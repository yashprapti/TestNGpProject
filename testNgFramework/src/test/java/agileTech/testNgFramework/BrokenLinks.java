package agileTech.testNgFramework;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	
	@Test
	public void searchBrokenLink() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\AgileTechSessions\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		int noofLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(noofLinks);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement e : allLinks) {
				try {
					String url = e.getAttribute("href");
					HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
					huc.setRequestMethod("HEAD");
					huc.connect();
					int resCode = huc.getResponseCode();
					if(resCode>=400) {
						System.out.println(url+"-- This Is Invalid URL");
					}else {
						System.out.println(url+"-- This Is Valid URL");
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

