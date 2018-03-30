package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;
import tumblr.pages.MainPage;
import tumblr.pages.StartPage;

public class TestCase {
	
	protected static AndroidDriver driver;
	private static String username = "marcinr123@onet.eu";
	private static String password = "test01test";
	

	
	@BeforeSuite
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability("deviceName","ALE-L21");
	    capabilities.setCapability("platformName","Android");
	    capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("appPackage", "com.tumblr");
		capabilities.setCapability("appActivity", "com.tumblr.ui.activity.RootActivity");
		capabilities.setCapability("autoAcceptAlerts", true);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		login();
	}
	
	@AfterMethod
	public void clean(){
		MainPage mainPage = new MainPage(driver);
		mainPage.goToDashboard();
	}
	
	
	@AfterSuite
	public void cleanUp() {
		driver.quit();
	}
	
	public static void login() {
		StartPage startPage = new StartPage(driver);
		startPage.logIn(username, password);
		
	}

}
