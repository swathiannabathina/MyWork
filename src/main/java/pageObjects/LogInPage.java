package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage 
{
	public WebDriver driver;
	
	By email = By.xpath("//input[@id='ap_email']");
	By submit = By.xpath("//input[@id='continue']");
	
	By password = By.xpath("//input[@id='ap_password']");
	By signIn = By.xpath("//input[@id='signInSubmit']");
	
	By signOut = By.xpath("//a[@id='nav-link-accountList']");
	By signOut1 = By.xpath("//a[@id='nav-item-signout-sa']");
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignIn()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement getSignOut()
	{
		return driver.findElement(signOut);
	}
	
	public WebElement getSignOut1()
	{
		return driver.findElement(signOut1);
	}
}