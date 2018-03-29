package tumblr.pages.AccountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.Page;
import io.appium.java_client.android.AndroidDriver;

public class AccountsPostsPage extends Page{
	
	private By recentPostLocator = By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.ViewSwitcher/android.widget.ViewSwitcher/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
	

	public AccountsPostsPage(AndroidDriver driver) {
		super(driver);
	}
	
	public WebElement getRecentPost() {
		scrollDown();
		return driver.findElement(recentPostLocator);
	}

}
