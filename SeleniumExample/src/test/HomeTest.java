package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Home;

public class HomeTest 
{
	private WebDriver driver;
	private Home homePage;
	
	@BeforeAll
	static void Initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	}
	
	@BeforeEach
	void StartupDriver()
	{
		driver = new ChromeDriver();
		homePage = new Home(driver);
	}
	
	@Test
    void testNavigation() 
	{
		homePage.goToHomeUrl();
		Assertions.assertEquals("https://www.selenium.dev/", driver.getCurrentUrl());
	}
	
	@Test
	void validateAbout()
	{
		homePage.goToHomeUrl();
		boolean isAboutDisplayed = homePage.isAboutDisplayed();
		Assertions.assertTrue(isAboutDisplayed, "About option is not displayed.");
	}
	
	@Test
	void clickAboutSeleniumLink()
	{
		homePage.goToHomeUrl();
		homePage.clickAboutSeleniumOption();
		Assertions.assertEquals("https://www.selenium.dev/about/", driver.getCurrentUrl());
	}
	
	@AfterEach
	void TearDown()
	{
		driver.quit();
	}
}
