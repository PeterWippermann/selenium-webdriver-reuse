package com.github.peterwippermann.selenium.reuse.good;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.peterwippermann.junit4.parameterizedsuite.ParameterContext;
import com.github.peterwippermann.selenium.reuse.WebDriverHelper;

@RunWith(Parameterized.class)
public class ParameterizedGoToJavaIOTest {

	@Parameters(name = "Browser #{index} - {0}")
	public static Iterable<WebDriver> produceBrowserInstances() {
		if (ParameterContext.isParameterSet()) {
			Object[] parameter = ParameterContext.getParameter(Object[].class);
			return Collections.singletonList((WebDriver) parameter[0]);
		} else {
			// If this test is run stand-alone, only run it in Firefox
			return Collections.singletonList(WebDriverHelper.startFirefox());
		}
	}

	@Parameter
	public WebDriver browser;

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = browser;
		driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/overview-summary.html");

		// click
		WebElement javaIo = driver.findElement(By.linkText("java.io"));
		javaIo.click();

		Thread.sleep(5000);

		// driver.quit();

	}

}
