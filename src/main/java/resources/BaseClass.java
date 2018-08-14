package resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initilizingDriver() throws Exception
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\SWATHI\\PageObject\\src\\main\\java\\resources\\AcadamyData.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\studies\\testing\\selenium\\Libraries\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\studies\\testing\\selenium\\Libraries\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\studies\\testing\\selenium\\Libraries\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenShot(String result) throws Exception
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("F://studies//testing//selenium//screenshots//"+result+"screen.png"));
	}
}