package com.github.peterwippermann.selenium.reuse.bad;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.peterwippermann.selenium.reuse.WebDriverHelper;

public class GoToJavaLangTest {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = WebDriverHelper.startFirefox();
		driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/overview-summary.html");

		// click 
		WebElement javaIo = driver.findElement(By.linkText("java.lang"));
		javaIo.click();

		Thread.sleep(5000);

		driver.quit();

	}

}
