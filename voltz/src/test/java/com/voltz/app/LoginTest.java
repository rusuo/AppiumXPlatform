package com.voltz.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest{

    private AppiumDriver<WebElement> driver;
		
//	@Before
//	public void setup() throws MalformedURLException {
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability("appium-version", "1.0");
//			capabilities.setCapability("platformName", "iOS");
//			capabilities.setCapability("platformVersion", "8.4");
//			capabilities.setCapability("deviceName", "iPhone 6");
//			capabilities.setCapability("app", "/Users/oanarusu/Library/Developer/Xcode/DerivedData/Voltz-haijuzfipcoqdjhannyirqpimaam/Build/Products/Debug-iphonesimulator/Voltz.app");
//			driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		}

    @Before
    public void setup() throws MalformedURLException {
    	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "192.168.56.101:5555");
		capabilities.setCapability("app", "/Users/oanarusu/Projects/VoltzAppiumC/voltz.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();
	}


    
		
		@Test
		public void testTest(){
			driver.findElement(By.name("New user")).click();

		}

}
