$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to launch the browser and hit FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_has_to_launch_the_browser_and_hit_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "to validate the forgot password link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has to click the forgot password link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_has_to_click_the_forgot_password_link()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.stepdefinition.LoginSteps.user_has_to_click_the_forgot_password_link(LoginSteps.java:45)\r\n\tat ✽.user has to click the forgot password link(file:src/test/resources/login.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to enter the mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_has_to_enter_the_mobile_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to navigate the OTP page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_has_to_navigate_the_OTP_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});