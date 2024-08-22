package com.LocatorsinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameDemo {
	@Test
	
	public void ExampleTageName() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		String tagname = driver.findElement(By.id("username")).getTagName();
		System.out.println(tagname);
		driver.quit();

	}

}
