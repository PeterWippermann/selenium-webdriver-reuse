package com.github.peterwippermann.selenium.reuse.good;

import java.util.LinkedList;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;

import com.github.peterwippermann.junit4.parameterizedsuite.ParameterizedSuite;
import com.github.peterwippermann.selenium.reuse.WebDriverHelper;

@RunWith(ParameterizedSuite.class)
@SuiteClasses({ParameterizedGoToJavaIOTest.class, ParameterizedGoToJavaLangTest.class})
public class ParameterizedJavaDocSuite {
	
	@Parameters(name = "Browser #{index} - {0}")
	public static Iterable<WebDriver> produceBrowserInstances() {
		LinkedList<WebDriver> browsers = new LinkedList<WebDriver>();
		browsers.add(WebDriverHelper.startFirefox());
		browsers.add(WebDriverHelper.startChrome());
		return browsers;
	}
	
	@Parameter
	public WebDriver browser;
}
