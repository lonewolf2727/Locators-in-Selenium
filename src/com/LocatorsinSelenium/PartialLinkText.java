package com.LocatorsinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartialLinkText {
		@Test
		
		public void linkText() throws Exception{
			System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.hollandandbarrett.com/u/login");
			driver.manage().window().maximize();
			
			String ts1 = driver.findElement(By.tagName("img")).getAttribute("src");
			System.out.println(ts1);
			Thread.sleep(5000);
			driver.quit();

		}
	}