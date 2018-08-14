package amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.BaseClass;

public class TitleValidationTest extends BaseClass
{
	private static Logger log = LogManager.getLogger(TitleValidationTest.class.getName());
	
	@BeforeTest
	public void initilization() throws Exception
	{
		driver = initilizingDriver();
		driver.get(prop.getProperty("url"));
		
		log.info("Driver Initilaized");
	}
	
	@Test
	public void basePageNavigation() throws Exception
	{
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getOrders().getText(), "Orders");
		
		log.info("BasePage Navigation executed");
		System.out.println("BasePage Navigation executed");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
}