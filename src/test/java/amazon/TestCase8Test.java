package amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCase8Test 
{
	public static void main(String[] args) 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true); // enabled by default
		caps.setCapability(
		    PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		    "C:\\\\Program Files\\\\phantomjs-2.1.1-windows\\\\bin\\\\phantomjs.exe"
		);

		WebDriver driver = new PhantomJSDriver(caps);
		driver.navigate().to("http://www.seleniumhq.org/");
	}
}