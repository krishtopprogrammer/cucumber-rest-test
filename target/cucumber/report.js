$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login verification",
  "description": "",
  "id": "login-verification",
  "keyword": "Ability"
});
formatter.before({
  "duration": 262911452,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Positive scenario with correct username and password",
  "description": "",
  "id": "login-verification;positive-scenario-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "The correct username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "username as \"xyz.abc\" and password as \"pqrs1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the response  is \"Correct Username and Password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_login_username_and_password()"
});
formatter.result({
  "duration": 170302423,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz.abc",
      "offset": 13
    },
    {
      "val": "pqrs1234",
      "offset": 39
    }
  ],
  "location": "LoginSteps.username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 60976279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Correct Username and Password",
      "offset": 18
    }
  ],
  "location": "LoginSteps.the_response_is(String)"
});
formatter.result({
  "duration": 86571,
  "status": "passed"
});
formatter.before({
  "duration": 5183993,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Invalid password",
  "description": "",
  "id": "login-verification;invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "The correct username and invalid password",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "username as \"xyz.abc\" and invalid password as \"nv12\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the response  is \"Correct\" Username and \"Incorrect\" Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_correct_username_and_invalid_password()"
});
formatter.result({
  "duration": 73629,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz.abc",
      "offset": 13
    },
    {
      "val": "nv12",
      "offset": 47
    }
  ],
  "location": "LoginSteps.username_as_and_invalid_password_as(String,String)"
});
formatter.result({
  "duration": 14570691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Correct",
      "offset": 18
    },
    {
      "val": "Incorrect",
      "offset": 41
    }
  ],
  "location": "LoginSteps.the_response_is_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 116469,
  "status": "passed"
});
formatter.before({
  "duration": 7053746,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Invalid username",
  "description": "",
  "id": "login-verification;invalid-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "The incorrect username and valid password",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "invalid username as \"abc\" and valid password as \"pqrs1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the response is username is invalid \"Invalid username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_incorrect_username_and_valid_password()"
});
formatter.result({
  "duration": 50426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 21
    },
    {
      "val": "pqrs1234",
      "offset": 49
    }
  ],
  "location": "LoginSteps.invalid_username_as_and_valid_password_as(String,String)"
});
formatter.result({
  "duration": 22480329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid username",
      "offset": 37
    }
  ],
  "location": "LoginSteps.the_response_is_username_is_invalid(String)"
});
formatter.result({
  "duration": 81216,
  "status": "passed"
});
formatter.before({
  "duration": 6869002,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Invalid username and password",
  "description": "",
  "id": "login-verification;invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "The incorrect username and invalid password",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "invalid username as \"abc\" and invalid password as \"nv12\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the response is both username and password is invalid \"Invalid username and password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_incorrect_username_and_invalid_password()"
});
formatter.result({
  "duration": 99512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 21
    },
    {
      "val": "nv12",
      "offset": 51
    }
  ],
  "location": "LoginSteps.invalid_username_as_and_invalid_password_as(String,String)"
});
formatter.result({
  "duration": 17377553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid username and password",
      "offset": 55
    }
  ],
  "location": "LoginSteps.the_response_is_both_username_and_password_is_invalid(String)"
});
formatter.result({
  "duration": 120931,
  "status": "passed"
});
});