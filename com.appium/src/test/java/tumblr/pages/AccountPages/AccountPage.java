package tumblr.pages.AccountPages;

import org.openqa.selenium.WebElement;

import config.Page;
import io.appium.java_client.android.AndroidDriver;

public class AccountPage extends Page{
	
	
	public AccountPage(AndroidDriver driver) {
		super(driver);
	}
	
	public AccountsPostsPage goToAccountsPosts() {
		
		return new AccountsPostsPage(driver);
	}
	
	public AccountsLikesPage goToAccountsLikes() {
		
		return new AccountsLikesPage(driver);
	}
	
	public AccountsFollowingPage goToAccountsFollowing() {
		
		return new AccountsFollowingPage(driver);
	}
	


}
