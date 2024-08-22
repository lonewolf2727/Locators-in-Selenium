package com.LocatorsinSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElemetsByLinks {
	WebDriver driver;
	int Total=0;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	
	}
	@Test
	public void partialLinkText() throws Exception{
		driver.navigate().to("https://www.hollandandbarrett.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		List<WebElement>Links = driver.findElements(By.xpath("//a"));
		int linkCount = Links.size();
		Total = Total+Links.size();
		
		System.out.println("Number of Links: "+linkCount);
		for(int i=1;i<Links.size();i++) {
			System.out.println(Links.get(i).getText());
		}
	}

}
