package tumblr.pages.posts;

import org.openqa.selenium.By;

import config.Page;
import io.appium.java_client.android.AndroidDriver;

public class TextPostPage extends Page{
	
	private By postPageHeaderLocator = By.id("com.tumblr:id/banner_text");
	private By titleLocator = By.xpath("//android.widget.EditText[@text='Title, if you want one']");
	private By postLocator = By.xpath("//android.widget.EditText[@text='Go ahead, type a post']");
	private By postButtonLocator = By.id("com.tumblr:id/action_button");
	
	public TextPostPage(AndroidDriver driver) {
		super(driver);
	}
	
	public void postText(String header, String text) {
		driver.findElement(titleLocator).sendKeys(header);
		driver.findElement(postButtonLocator).click();
	}

}
