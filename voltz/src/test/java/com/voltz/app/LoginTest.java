package com.voltz.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.TestCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest{

	RemoteWebDriver wd;
		
	@Before
	public static void main(String[] args) throws MalformedURLException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appium-version", "1.0");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "8.4");
			capabilities.setCapability("deviceName", "iPhone 6");
			capabilities.setCapability("app", "/Users/oanarusu/Library/Developer/Xcode/DerivedData/Voltz-haijuzfipcoqdjhannyirqpimaam/Build/Products/Debug-iphonesimulator/Voltz.app");
			RemoteWebDriver wd = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			wd.close();
		}
	
	  @After
	  public void tearDown() throws Exception {
	    wd.quit();
	  }

		
		@Test
		public void testTest(){
			wd.findElement(By.name("New user")).click();

		}

}
