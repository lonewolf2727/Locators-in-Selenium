package com.LocatorsinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameDemo {
	@Test
	public void ExampleClassName() throws Exception{
	
	
	System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/u/login");
	
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//boolean displayed = driver.findElement(By.className("ProductCard-module_promotion__6fdoE"));
	

}
}
