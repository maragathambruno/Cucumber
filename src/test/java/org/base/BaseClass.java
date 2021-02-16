package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver d;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();

	}

	public static void url(String url) {

		d.get(url);
	}

	public static void fill(WebElement e, String v) {
		e.sendKeys(v);

	}

	public static void btnClick(WebElement e) {
		// TODO Auto-generated method stub
		e.click();
	}

}
