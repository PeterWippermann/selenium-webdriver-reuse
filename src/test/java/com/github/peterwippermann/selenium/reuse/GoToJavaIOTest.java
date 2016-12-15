package com.github.peterwippermann.selenium.reuse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoToJavaIOTest {

	@Test
	public void test() throws InterruptedException {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(cap);
		driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/overview-summary.html");

		// click 
		WebElement javaIo = driver.findElement(By.linkText("java.io"));
		javaIo.click();

		Thread.sleep(5000);

		driver.quit();

	}

}
