package tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.AppLaunch;
import pages.BaseClass;
import pages.Home;
import pages.Login;
import pages.MyShaadi;

public class MyshaadiTestCase extends BaseClass {

	private static final String emailid = "pritshikharaj@gmail.com";
	private static final String pwd = "12345";

	public AndroidDriver<MobileElement> driver;

	private MobileElement loginBtn;

	AppLaunch appLaunch;
	Login login;
	Home home;
	MyShaadi myShaadi;

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void beforeMethod(Method m) {

		appLaunch = new AppLaunch();
		System.out.println("/n" + "***** starting test:" + m.getName() + "*****" + "/n");

	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test
	public void shaadi() {
		login = appLaunch.clickOnLogin(driver, loginBtn);
		login.enterMobileNoOrEmailid(emailid);
		login.enterPassword(pwd);
		home = login.clcikonLogin();
		myShaadi = home.clcikOnMyShaadi();
		myShaadi.connectPreMatch();
		myShaadi.connectNewMatch();
	}

}
