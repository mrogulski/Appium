package tumblr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.TestCase;
import tumblr.pages.MainPage;
import tumblr.pages.StartPage;
import tumblr.pages.posts.TextPostPage;

public class PostTests extends TestCase{
	
	private String username = "test@test.com";
	private String password = "testtest";
	
	private String postHeader = "Test header";
	private String postContent = "Test content";
	

	
	@Test
	public void postTextTest(){
		MainPage mainPage = new StartPage(driver).logIn(username, password);
		TextPostPage textPostPage = mainPage.openComposeMenu().composeTextPost();
		//to do - change the method
		textPostPage.postText(postHeader, postContent);
		
		

	}

}
