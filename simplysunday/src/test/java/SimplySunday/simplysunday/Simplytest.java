package SimplySunday.simplysunday;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Simplytest {
	
	@Test
	
	public void test1() throws InterruptedException, MalformedURLException {
	
	DesiredCapabilities capabilities=DesiredCapabilities.android();
	
	//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	
	capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SAMSUNGJ7MAX");
	
	capabilities.setCapability(MobileCapabilityType.VERSION,"8.1.0");
	
	capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Admin\\eclipse-workspace\\simplysunday\\app\\ApiDemos-debug (1).apk");
	
	URL url =new URL("http://0.0.0.0:4723/wd/hub");
	
	WebDriver driver=new AndroidDriver(url,capabilities);
	
	//driver.get("http://www.facbook.com");
	
	//System.out.println("Title"+driver.getTitle());
	
	//Thread.sleep(5000);
	
	//driver.quit();
	
	

	
		
		

	}

}
