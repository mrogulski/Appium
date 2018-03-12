package tumblr.tests;

import org.testng.annotations.*;

import config.TestCase;
import tumblr.pages.MainPage;
import tumblr.pages.StartPage;

public class GetStartedTests extends TestCase {
	
	@Test
	public void getStartedTest(){
		StartPage startPage = new StartPage(driver);
		startPage.getStarted("18");
	}

}
