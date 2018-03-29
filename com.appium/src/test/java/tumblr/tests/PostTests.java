package tumblr.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.TestCase;
import tumblr.pages.MainPage;
import tumblr.pages.AccountPages.AccountsPostsPage;
import tumblr.pages.posts.PhotoPostPage;
import tumblr.pages.posts.TextPostPage;

public class PostTests extends TestCase{
	
	MainPage mainPage = new MainPage(driver);
	
	
	private String postHeader = "Test header";
	private String postContent = "Test content";
	

	
	@Test
	public void postTextTest(){
		

		TextPostPage textPostPage = mainPage.openComposeMenu().composeTextPost();
		textPostPage.postText(postHeader, postContent);

		AccountsPostsPage accountsPostsPage = mainPage.goToAccount().goToAccountsPosts();
		accountsPostsPage.scrollDown();
		
		WebElement recentPost = accountsPostsPage.getRecentPost();
	
		Assert.assertEquals(recentPost.getText(), postHeader);
		
	}
	
	@Test
	public void postPhotoest(){
		
		
		PhotoPostPage photoPostPage = mainPage.openComposeMenu().composePhotoPost();
		photoPostPage.postPhoto(postContent);

		AccountsPostsPage accountsPostsPage = mainPage.goToAccount().goToAccountsPosts();
		accountsPostsPage.scrollDown();
		
		WebElement recentPost = accountsPostsPage.getRecentPost();
	
		Assert.assertEquals(recentPost.getText(), postHeader);
		
	}


}
