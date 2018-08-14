package amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogInPage;
import resources.BaseClass;

public class HomePageTest extends BaseClass
{
	private static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	
	@BeforeTest
	public void initilization() throws Exception
	{
		driver = initilizingDriver();
		driver.get(prop.getProperty("url"));
		log.info("Driver Initilaized");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws Exception
	{
		driver.get(prop.getProperty("url"));
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		
		log.info("LandingPage Executed");
		
		LogInPage lip = new LogInPage(driver);
		lip.getEmail().sendKeys(username);
		
		log.info("LogIn Page executed");
		
		lip.getSubmit().click();
		
		lip.getPassword().sendKeys(password);
		lip.getSignIn().click();
		
		WebElement SignOut = lip.getSignOut();
		Actions action = new Actions(driver);
		action.moveToElement(SignOut).build().perform();
		lip.getSignOut1().click();
		
		System.out.println("HomePage Executed");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="9030804086";
		data[0][1]="Nagarjuna@19";
		
		//data[1][0]="fhgfjhgjhjk";
		//data[1][1]="hddfyuthjhhhffg";
		
		return data;
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
}