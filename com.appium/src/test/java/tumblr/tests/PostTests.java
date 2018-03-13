package tumblr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.TestCase;
import tumblr.pages.StartPage;
import tumblr.pages.posts.TextPostPage;

public class PostTests extends TestCase{
	

	
	@Test
	public void postTextTest(){
		TextPostPage textPostPage = new StartPage(driver).logIn("test@test.com", "testtest").openComposeMenu().composeTextPost();
		textPostPage.postText("Test Header", "Test Post");

	}

}
