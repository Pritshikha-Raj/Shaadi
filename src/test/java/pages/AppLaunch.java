package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AppLaunch extends BaseClass {
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'com.shaadi.android:id/btn_morph_login' ]")
	private MobileElement loginBtn;

	public Login clickOnLogin(AndroidDriver driver, MobileElement loginBtn) {

		loginBtn.click();
		return new Login();
	}

}
