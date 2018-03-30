package tumblr.pages.posts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class PhotoPostPage extends Page{
	
	private By nextButtonLocator = By.id("com.tumblr:id/action_next");
	private By firstImageLocator = By.xpath("//android.widget.TextView[@index=\"2\"]");
	//must be shortened
	private By textFieldLocatorLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.MultiAutoCompleteTextView");
	private By postButtonLocator = By.id("com.tumblr:id/action_button");
	
	private By notifLocator = By.xpath("//android.widget.TextView[starts-with(@text, 'Posted')]");
	
	public PhotoPostPage(AndroidDriver driver) {
		super(driver);

	}
	
	public void postPhoto(String text){
		allowAccess();
		allowAccess();//stupid but works
		driver.findElement(firstImageLocator).click();
		driver.findElement(nextButtonLocator).click();
		driver.findElement(textFieldLocatorLocator).sendKeys(text);
		driver.findElement(postButtonLocator).click();
		driver.openNotifications();
		
		try {
		waitUntilItemsDisplayed(notifLocator);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			closeNotificationBar();
		}
	
	}
	


}
