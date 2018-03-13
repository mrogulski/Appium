package tumblr.pages;

import org.openqa.selenium.By;

import config.Page;
import io.appium.java_client.android.AndroidDriver;

public class MainPage extends Page{
	
	public By navBarLocator = By.id("com.tumblr:id/top_nav_bar");
	private By dashboardLocator = By.id("DASHBOARD");
	private By exploreLocator = By.id("EXPLORE");
	
	private By composePostLocator = By.id("com.tumblr:id/composer_fab");

	public MainPage(AndroidDriver driver) {
		super(driver);
	}
	
	public ExplorePage gotoExplore() {
		driver.findElement(exploreLocator).click();		
		return new ExplorePage(driver);
		
	}
	
	public ComposeMenuPage openComposeMenu() {
		driver.findElement(composePostLocator).click();
		return new ComposeMenuPage(driver);
		
	}

}
