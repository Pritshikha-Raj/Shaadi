package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login extends BaseClass {
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id = 'com.shaadi.android:id/edt_username' ]")
	private MobileElement mobilenooremailid;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id = 'com.shaadi.android:id/edt_password' ]")
	private MobileElement password;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'com.shaadi.android:id/btn_login' ]")
	private MobileElement loginctaclick;

	public Login enterMobileNoOrEmailid(String emailid) {
		mobilenooremailid.sendKeys(emailid);
		return this;

	}

	public Login enterPassword(String pwd) {
		password.sendKeys(pwd);
		return this;

	}

	public Home clcikonLogin() {
		loginctaclick.click();
		return new Home();

	}

}
