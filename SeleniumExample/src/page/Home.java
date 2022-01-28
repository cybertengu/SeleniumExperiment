package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home 
{
	private WebDriver driver;
	By logo = By.id("selenium_logo");
	By about = By.id("navbarDropdown");
	By aboutSelenium = By.linkText("About Selenium");
	
	public Home(WebDriver driver)
	{
		this.setDriver(driver);
	}

	public WebDriver getDriver() 
	{
		return driver;
	}

	public void setDriver(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void goToHomeUrl()
	{
		driver.get("https://selenium.dev");
	}
	
	public boolean isAboutDisplayed()
	{
		WebElement aboutElement = driver.findElement(about);
		boolean isAboutDisplayed = aboutElement.isDisplayed();
				
		return isAboutDisplayed;
	}
	
	public void clickAboutSeleniumOption()
	{
		WebElement aboutElement = driver.findElement(about);
		aboutElement.click();
		WebElement aboutSeleniumElement = driver.findElement(aboutSelenium);
		aboutSeleniumElement.click();
	}
}
