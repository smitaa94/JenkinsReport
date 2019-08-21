$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training_h2a.06.15/Desktop/Selenium workspace/Jen/Feature456/Reports.feature");
formatter.feature({
  "name": "This is to check the report generation on jenkins",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testme login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launched the test me app",
  "keyword": "Given "
});
formatter.match({
  "location": "Reports.user_launched_the_test_me_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logged in with valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "Reports.user_logged_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies for login status in his credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Reports.verifies_for_login_status_in_his_credentials()"
});
formatter.result({
  "status": "passed"
});
});