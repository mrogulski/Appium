package tumblr.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.TestCase;
import tumblr.pages.MainPage;
import tumblr.pages.AccountPages.AccountsPostsPage;
import tumblr.pages.posts.TextPostPage;

public class PostTests extends TestCase{
	
	
	private String postHeader = "Test header";
	private String postContent = "Test content";
	

	
	@Test
	public void postTextTest(){
		
		MainPage mainPage = new MainPage(driver);
		
		TextPostPage textPostPage = mainPage.openComposeMenu().composeTextPost();
		textPostPage.postText(postHeader, postContent);

		AccountsPostsPage accountsPostsPage = mainPage.goToAccount().goToAccountsPosts();
		accountsPostsPage.scrollDown();
		
		WebElement recentPost = accountsPostsPage.getRecentPost();
	
		Assert.assertEquals(recentPost.getText(), postHeader);
		
	
		

	}

}
