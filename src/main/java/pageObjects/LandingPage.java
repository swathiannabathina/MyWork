package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	public WebDriver driver;
	By logIn = By.xpath(".//*[@id='nav-link-accountList']/span[1]");
	By orders = By.xpath(".//*[@id='nav-orders']/span[2]");
	By departments = By.xpath(".//*[@id='nav-link-shopall']/span[2]");
	
	
	public LandingPage(WebDriver driver) 
	{
		this.driver = driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(logIn);
	}
	
	public WebElement getOrders()
	{
		return driver.findElement(orders);
	}
	
	public WebElement getDepartmentsNavigation()
	{
		return driver.findElement(departments);
	}
}