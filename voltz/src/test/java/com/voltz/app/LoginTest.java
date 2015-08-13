package com.voltz.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest{

    private AppiumDriver<WebElement> driver;
		
	@Before
	public void setup() throws MalformedURLException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appium-version", "1.0");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "8.4");
			capabilities.setCapability("deviceName", "iPhone 6");
			capabilities.setCapability("app", "/Users/oanarusu/Library/Developer/Xcode/DerivedData/Voltz-haijuzfipcoqdjhannyirqpimaam/Build/Products/Debug-iphonesimulator/Voltz.app");
			driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}

		
		@Test
		public void testTest(){
			driver.findElement(By.name("New user")).click();

		}

}
