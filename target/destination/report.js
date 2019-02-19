$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ExcelDataRead.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Multiple Logins in Facebook",
  "description": "",
  "id": "testing-multiple-logins-in-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 155316214,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Reading Multiple Login Ids from Excel with HashMap",
  "description": "",
  "id": "testing-multiple-logins-in-facebook;reading-multiple-login-ids-from-excel-with-hashmap",
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
  "duration": 185497421,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginStepDefs.step2()"
});
formatter.result({
  "duration": 52872066143,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginStepDefs.step3()"
});
formatter.result({
  "duration": 228810,
  "status": "passed"
});
formatter.after({
  "duration": 348951,
  "status": "passed"
});
formatter.uri("ReadExcel.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Multiple Logins in Facebook",
  "description": "",
  "id": "testing-multiple-logins-in-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 447357,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Reading Multiple Login Ids from Excel without HashMap",
  "description": "",
  "id": "testing-multiple-logins-in-facebook;reading-multiple-login-ids-from-excel-without-hashmap",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "U r in Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Getting Values From Excel and Feeding to facebook Login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Check Whether Logging in to facebook And quit",
  "keyword": "Then "
});
formatter.match({
  "location": "ReadExcelStepDefs.U_r_in_facebook_login_page()"
});
formatter.result({
  "duration": 5783348778,
  "status": "passed"
});
formatter.match({
  "location": "ReadExcelStepDefs.Getting_Values_From_Excel_and_Feeding_to_Facebook_Login()"
});
formatter.result({
  "duration": 26548966279,
  "status": "passed"
});
formatter.match({
  "location": "ReadExcelStepDefs.Check_Whether_Logging_in_to_Facebook_And_quit()"
});
formatter.result({
  "duration": 34412,
  "status": "passed"
});
formatter.after({
  "duration": 709420156,
  "status": "passed"
});
});