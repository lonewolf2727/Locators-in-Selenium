package com.LocatorsinSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class IDTestDemo {
	WebDriver driver;
	@Test
	public void ExampleId() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//Locators Id, Name and Xpath
		driver.findElement(By.id("username")).sendKeys("shourjosenguptaroop@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Kiit@y2j");
		//driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void ExampleEnabled() {
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://auth.hollandandbarrett.com/u/login");
		Boolean enabled= driver.findElement(By.id("username")).isEnabled();
		System.out.println(enabled);
		driver.quit();
	}
	@Test
	public void ExampleSelected() {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://auth.hollandandbarrett.com/u/login");
		Boolean selected= driver.findElement(By.id("username")).isSelected();
		System.out.println(selected);
		driver.quit();
	}
	@Test
	public void ExampleClear() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://auth.hollandandbarrett.com/u/login");
		driver.findElement(By.id("username")).sendKeys("shourjosenguptaroop@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(4000);
		driver.quit();
	}


}
