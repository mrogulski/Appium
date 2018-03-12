package tumblr.pages;


import org.openqa.selenium.By;

import config.Page;
import io.appium.java_client.android.AndroidDriver;

public class StartPage extends Page {
	
	private By LoginLocator = By.id("com.tumblr:id/login_button");
	private By getStartedLocator = By.id("com.tumblr:id/signup_button");
	private By ageFieldLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.MultiAutoCompleteTextView");
	private By nextButtonLocator = By.id("com.tumblr:id/next_button");
	private String[] interests = {"Sports", "Cute", "Museums", "Movies", "Music"};

	
	public StartPage(AndroidDriver driver) {
		super(driver);
	}
	
	public MainPage getStarted(String age){
		driver.findElement(getStartedLocator).click();
		driver.findElement(ageFieldLocator).sendKeys(age);
		driver.findElement(nextButtonLocator).click();


//		not so reliable
//		for(String interest: interests) {
//			driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + interest + "\"]")).click();
//		}
		
		for(int i = 1; i <6; i++) {
			driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"com.tumblr:id/topic_list\"]/android.widget.FrameLayout[" + i + "]/android.widget.TextView")).click();
		}
		
		driver.findElement(nextButtonLocator).click();
		
		
		return new MainPage(driver);
		
	}

}
