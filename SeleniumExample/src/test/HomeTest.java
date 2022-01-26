package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest 
{
	WebDriver driver;
	
	@BeforeAll
	static void Initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	}
	
	@BeforeEach
	void StartupDriver()
	{
		driver = new ChromeDriver();
	}
	
	@Test
    void Navigation() 
	{
		driver.get("https://selenium.dev");
		Assertions.assertEquals("https://www.selenium.dev/", driver.getCurrentUrl());
		driver.quit();
	}
	
	@AfterEach
	void TearDown()
	{
		driver.quit();
	}
}
