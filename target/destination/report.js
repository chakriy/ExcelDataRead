$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ExcelDataRead.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Multiple Logins in Facebook",
  "description": "",
  "id": "testing-multiple-logins-in-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1949832014,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Reading Multiple Login Ids from Excel",
  "description": "",
  "id": "testing-multiple-logins-in-facebook;reading-multiple-login-ids-from-excel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "U r in facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Getting Values From Excel and Feeding to Facebook Login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Check Whether Logging in to Facebook And quit",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefs.step1()"
});
formatter.result({
  "duration": 172874224,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginStepDefs.step2()"
});
formatter.result({
  "duration": 48487694058,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginStepDefs.step3()"
});
formatter.result({
  "duration": 101425,
  "status": "passed"
});
formatter.after({
  "duration": 1225553,
  "status": "passed"
});
});