package com.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateBrowserSession {

	public static AppiumDriver initializeDriver(String platform) throws MalformedURLException {
	
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554"); 
			
		caps.setCapability("chromedriverExecutableDir", "your downaload path"); // driver capability
		// caps.setCapability(MobileCapabilityType.UDID, "ZY223HVFQH");        // real device
 
		
		URL url=new URL("http://127.0.1.1:4723/wd/hub");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		return new AndroidDriver(url,caps)	;
	
	}

}
