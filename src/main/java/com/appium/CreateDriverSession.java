package com.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateDriverSession {

	public static AppiumDriver initializeDriver(String platform) throws MalformedURLException {
		
		
	
		//"C:\\Users\\consumer\\eclipse-workspace\\com.appium\\src\\main\\java\\resources\\ApiDemos-debug.apk"
		
		String appurl=System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "resources"
		+  File.separator + "ApiDemos-debug.apk";
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		//caps.setCapability(MobileCapabilityType.UDID, "emulator-5554"); 
		//caps.setCapability("avd", "Pixel_3");
		//caps.setCapability("avdLaunchTimeout", "180800");
		
		caps.setCapability(MobileCapabilityType.UDID, "ZY223HVFQH");        // real device
		
		//caps.setCapability("newCommandTimeout", 300);
		
		// launch emulator programmatically 
		caps.setCapability(MobileCapabilityType.APP, appurl);	
		
		/*
		 *  to launch existing app -appPackage
		 *  to launch app at particular activity within app-appActivity ex. gmail->sendemail
		 */
		//caps.setCapability("appPackage", "io.appium.android.apis");
		//caps.setCapability("appActivity", ".accessibility.AccessibilityNodeProviderActivity");
		
		URL url=new URL("http://127.0.1.1:4723/wd/hub");  //-? localhost can be used here as well
		
		AppiumDriver appiumDriver=new AndroidDriver(url,caps);
		
		// Unlock PIN 
		
		//caps.setCapability("unlockType", "pin");
		//caps.setCapability("unlockType", "pattern");
		//caps.setCapability("unlockKey", 1111);
		
		// Chrome Driver Capability :
		
		caps.setCapability("chromedriverExecutableDir", "your downaload path");
		
		return appiumDriver;	

	}

}
