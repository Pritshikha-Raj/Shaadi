package pages;

import com.base.shaadi.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyShaadi extends BaseClass {

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id = 'com.shaadi.android:id/tv_title' and contains(@text , 'Premium Matches (999+)')]")
	private MobileElement prematchtext;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id = 'com.shaadi.android:id/llConnect')]")
	private MobileElement connectprematchtext;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id = 'com.shaadi.android:id/tv_title' and  contains(text, 'New Matches')]")
	private MobileElement newmatchtext;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id = 'com.shaadi.android:id/llConnect' ]")
	private MobileElement connectnewmatchtext;

	public MyShaadi connectPreMatch() {
		prematchtext.isDisplayed();
		connectprematchtext.click();
		return this;

	}

	public MyShaadi connectNewMatch() {
		newmatchtext.isDisplayed();
		connectnewmatchtext.click();
		return this;

	}

}
