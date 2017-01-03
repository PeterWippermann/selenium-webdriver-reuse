package com.github.peterwippermann.selenium.reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverHelper {

	public static WebDriver startFirefox() {
		// TODO GeckoDriver must be present on your PATH
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		return new FirefoxDriver(cap);
	}

	public static WebDriver startChrome() {
		// TODO ChromeDriver must be present on your PATH
		return new ChromeDriver();
	}

}
