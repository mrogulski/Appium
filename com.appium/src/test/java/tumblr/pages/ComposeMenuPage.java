package tumblr.pages;

import org.openqa.selenium.By;

import config.Page;
import io.appium.java_client.android.AndroidDriver;
import tumblr.pages.posts.TextPostPage;

public class ComposeMenuPage extends Page{
	
	private By composeGIFPostLocator = By.id("com.tumblr:id/compose_post_gif");
	private By composeQuotePostLocator = By.id("com.tumblr:id/compose_post_quote");
	private By composeTextPostLocator = By.id("com.tumblr:id/compose_post_text");
	private By composeVideoPostLocator = By.id("com.tumblr:id/compose_post_video");
	private By composeAudioPostLocator = By.id("com.tumblr:id/compose_post_audio");
	private By composeChatPostLocator = By.id("com.tumblr:id/compose_post_chat");
	private By composeLinkPostLocator = By.id("com.tumblr:id/compose_post_link");
	private By composePhotoPostLocator = By.id("com.tumblr:id/compose_post_photo");
	private By closeLocator = By.id("com.tumblr:id/composer_fab");

	public ComposeMenuPage(AndroidDriver driver) {
		super(driver);
	}
	
	public TextPostPage composeTextPost() {
		driver.findElement(composeTextPostLocator).click();
		return new TextPostPage(driver);
	}

}
