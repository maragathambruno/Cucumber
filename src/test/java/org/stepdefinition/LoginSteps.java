package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.LoginPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass {

	public static LoginPOJO	l;
	
	@Given("User has to launch the browser and hit FB url")
	public void user_has_to_launch_the_browser_and_hit_FB_url() {
		url("https://www.facebook.com/");

	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dt) {
		List<Map<String, String>> mp = dt.asMaps();

		
			l = new LoginPOJO();
		fill(l.getUser(), "qwert");
		fill(l.getPassword(), "1234567");
	}

	@When("click the login button")
	public void click_the_login_button() {
		btnClick(l.getButton());
	}

	@When("user has to click the forgot password link")
	public void user_has_to_click_the_forgot_password_link() throws InterruptedException {
		btnClick(l.getForgetlink());
	}

	@When("user has to enter the mobile number")
	public void user_has_to_enter_the_mobile_number() {
		d.findElement(By.id("identify_email")).sendKeys("9524524901");
	}

	@Then("user has to navigate the OTP page")
	public void user_has_to_navigate_the_OTP_page() {
		d.findElement(By.xpath("//button[@id='did_submit']")).click();

	}

	@Then("user can able to enter the home page")
	public void user_can_able_to_enter_the_home_page() {
		System.out.println("user unable to login");

	}

}
