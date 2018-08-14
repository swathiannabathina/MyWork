package net.atos.wlp.ibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	@Test
	public void invokeBrowser() {
		
		System.setProperty("phatomjs.binary.path", ".\\Externallib\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver(); 
		
		driver.get("http://phantomjs.org/download.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
}
