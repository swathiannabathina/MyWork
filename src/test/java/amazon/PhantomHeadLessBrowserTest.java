package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomHeadLessBrowserTest{
	public static WebDriver driver = null;
	public static void main(String[] args){ 
	
		System.setProperty("phantomjs.binary.path", "C:\\Program Files\\phantomjs-2.1.1-windows\\bin\\phantomjs");
		
		driver = new PhantomJSDriver();
		driver.get("https://www.facebook.com");
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
		
	}
}