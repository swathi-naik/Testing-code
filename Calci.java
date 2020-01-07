package calculator;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calci {
	public static void main(String []args) throws Exception{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy A50");
	cap.setCapability(MobileCapabilityType.UDID,"RZ8M71WW27N");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
	cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
	cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
	
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url,cap);
	Thread.sleep(5000);
	

	}}
