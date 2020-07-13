package pages;

import com.base.shaadi.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Home extends BaseClass {

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id = 'com.shaadi.android:id/tvMyShaadi' ]")
	private MobileElement myshaadi;

	public MyShaadi clcikOnMyShaadi() {
		myshaadi.click();
		return new MyShaadi();
	}
}
