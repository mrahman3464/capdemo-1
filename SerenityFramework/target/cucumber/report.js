$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BugTrackerApp/ApExBugTracker.feature");
formatter.feature({
  "line": 1,
  "name": "BugTracker App",
  "description": "",
  "id": "bugtracker-app",
  "keyword": "Feature"
});
formatter.before({
  "duration": 44419936,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Happy Path",
  "description": "",
  "id": "bugtracker-app;happy-path",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User navigate to Bug Tracker Login Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("WebSheetApp/ApExWebSheet.feature");
formatter.feature({
  "line": 1,
  "name": "Simple Web App",
  "description": "",
  "id": "simple-web-app",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2479748,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Happy Path",
  "description": "",
  "id": "simple-web-app;happy-path",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User navigate to Simple Web Sheet Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Sing In with Valid user name and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User do some administrative work on Dashbord",
  "keyword": "Then "
});
formatter.match({
  "location": "WebSheetStepDef.user_navigate_to_Simple_Web_Sheet_Login_Page()"
});
formatter.result({
  "duration": 14144089461,
  "status": "passed"
});
formatter.match({
  "location": "WebSheetStepDef.user_Sing_In_with_Valid__valid()"
});
formatter.result({
  "duration": 17309516911,
  "status": "passed"
});
formatter.match({
  "location": "WebSheetStepDef.user_do_some_administrative_work_on_Dashbord()"
});
formatter.result({
  "duration": 30395,
  "status": "passed"
});
});