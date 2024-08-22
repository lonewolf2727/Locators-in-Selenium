package com.LocatorsinSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameDemo1 {
	
	@Test
	public void SameClassWithMultipleElements() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/basket");
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Locate multiple elements for the same class name.
		
		List<WebElement> elements = driver.findElements(By.className("ProductCard-module_productImage_7VPgE"));
		
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		driver.quit();
	}
	

}
