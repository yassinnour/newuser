$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/longin.feature");
formatter.feature({
  "line": 1,
  "name": "Validate login functionality",
  "description": "",
  "id": "validate-login-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is On the Techfios Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.User_is_On_the_Techfios_Login_Page()"
});
formatter.result({
  "duration": 9179949500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "validate-login-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User inters username as",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be landing on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.user_inters_username_as()"
});
formatter.result({
  "duration": 272701400,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_enters_password()"
});
formatter.result({
  "duration": 112473100,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2323758000,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_should_be_landing_on_dashboard_page()"
});
formatter.result({
  "duration": 141683100,
  "status": "passed"
});
});