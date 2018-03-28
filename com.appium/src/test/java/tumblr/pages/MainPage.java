package tumblr.pages;

import org.openqa.selenium.By;

import config.Page;
import io.appium.java_client.android.AndroidDriver;
import tumblr.pages.AccountPages.AccountPage;
import tumblr.pages.messagesPages.MessagesPage;

public class MainPage extends Page{
	
	public By navBarLocator = By.id("com.tumblr:id/top_nav_bar");
	private By dashboardLocator = By.id("DASHBOARD");
	private By exploreLocator = By.id("EXPLORE");
	private By messagesLocator = By.id("MESSAGES");
	private By accountLocator = By.id("ACCOUNT");
	
	private By composePostLocator = By.id("com.tumblr:id/composer_fab");

	public MainPage(AndroidDriver driver) {
		super(driver);
	}
	
	public void goToDashboard() {
		driver.findElement(dashboardLocator).click();
	}
	
	public ExplorePage goToExplore() {
		driver.findElement(exploreLocator).click();		
		return new ExplorePage(driver);
		
	}
	
	public MessagesPage goToMessages() {
		driver.findElement(messagesLocator).click();
		return new MessagesPage(driver);
	}
	
	public AccountPage goToAccount() {
		driver.findElement(accountLocator).click();
		return new AccountPage(driver);
	}
	
	
	public ComposeMenuPage openComposeMenu() {
		driver.findElement(composePostLocator).click();
		return new ComposeMenuPage(driver);
		
	}

}
