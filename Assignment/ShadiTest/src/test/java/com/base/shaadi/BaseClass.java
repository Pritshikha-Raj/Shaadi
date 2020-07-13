package com.base.shaadi;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	public static class BaseTest {
		protected static AppiumDriver driver;

		public BaseTest() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		@BeforeTest
		public void setup()
				throws MalformedURLException {

			try {

				DesiredCapabilities caps = new DesiredCapabilities();

				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for x86");
				caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

				caps.setCapability("APP",
						"/Users/pritshikharaj/eclipse-workspaces/neon/ShadiTest/src/test/resources/apps/shaadi.apk");

				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				driver = new AppiumDriver(url, caps);

			} catch (Exception e) {
				System.out.println("Cause is : " + e.getCause());
				System.out.println("Message is :" + e.getMessage());
				e.printStackTrace();
			}
		}

		public void waitForElementToBePresent(MobileElement e) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(e));
		}

		public void click(MobileElement e) {
			waitForElementToBePresent(e);
			e.click();
		}

		public void sendKeys(MobileElement e, String text) {
			waitForElementToBePresent(e);
			e.sendKeys(text);
		}

		public void getAttribute(MobileElement e, String attribute) {
			waitForElementToBePresent(e);
			e.sendKeys(attribute);
		}

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
