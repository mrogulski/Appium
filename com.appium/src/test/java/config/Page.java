package config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public abstract class Page {
	
	protected static AndroidDriver driver;
	private By accessLoactor = By.id("com.android.packageinstaller:id/permission_allow_button");
	private By closeNotifBarLocator = By.id("com.android.systemui:id/clear_notification");
	
	public Page(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public static void scrollDown() {
		Dimension size = driver.manage().window().getSize();
			int startX = size.getWidth() / 2;
			int startY = size.getHeight() / 2;
			int endX = startX;
			int endY = (int) (startY / 2);
			Duration duration  = Duration.ofSeconds(2);
			TouchAction action = new TouchAction(driver);
			action.press(startX, startY).waitAction(duration);
			action.moveTo(endX, endY).release().perform();

		}
	
	public void allowAccess() {
		if(driver.findElement(accessLoactor).isDisplayed()) {
			driver.findElement(accessLoactor).click();
		}
	}
	
	public void waitUntilItemsDisplayed(By locator) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void closeNotificationBar() {
		driver.findElement(closeNotifBarLocator).click();
	}
}
