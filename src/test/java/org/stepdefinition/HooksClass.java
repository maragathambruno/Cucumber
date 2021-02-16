package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends BaseClass {

	@Before
	public void beforeExecution() {
		launchChrome();

	}

	@Before("@Sanity")
	public void beforeExecutionGroup() {
		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
	@After("@Smoke")
	public void afterExecutiongroup() {
		//screensht code
	}

	@After
	public void afterExecution() {
		d.quit();
	}
}
