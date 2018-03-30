package tumblr.pages.posts;

import org.openqa.selenium.By;

import config.Page;
import io.appium.java_client.android.AndroidDriver;

public class TextPostPage extends Page{
	
	private By postPageHeaderLocator = By.id("com.tumblr:id/banner_text");
	private By titleLocator = By.xpath("//android.widget.EditText[@text='Title, if you want one']");
	private By postLocator = By.xpath("//android.widget.EditText[@instance='1']");//to improve
	private By postButtonLocator = By.id("com.tumblr:id/action_button");
	
	public TextPostPage(AndroidDriver driver) {
		super(driver);
	}
	
	public void postText(String header, String text) {
		
		if(driver.findElement(titleLocator).isDisplayed() == false) {
			driver.navigate().back();//to make fields enabled
			driver.navigate().back();
		}

		driver.findElement(titleLocator).sendKeys(header);
		driver.findElement(postLocator).sendKeys(text);
		driver.findElement(postButtonLocator).click();
	}

}


