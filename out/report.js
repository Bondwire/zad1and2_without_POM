$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddressZad1.feature");
formatter.feature({
  "line": 2,
  "name": "AddressZad1",
  "description": "",
  "id": "addresszad1",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "zalogowanie wpisanie adresu sprawdzenie adresu",
  "description": "",
  "id": "addresszad1;zalogowanie-wpisanie-adresu-sprawdzenie-adresu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "zalogowany na usera z 10minut mail",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "jestem na stronie z kafelkiem Address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wypelniam formularz \u003calias\u003e \u003caddress\u003e \u003ccity\u003e \u003czip/postal\u003e \u003ccode\u003e \u003ccountry\u003e \u003cphone\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "sprawdzam czy dane sa ok",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "addresszad1;zalogowanie-wpisanie-adresu-sprawdzenie-adresu;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "zip/postal",
        "code",
        "country",
        "phone"
      ],
      "line": 10,
      "id": "addresszad1;zalogowanie-wpisanie-adresu-sprawdzenie-adresu;;1"
    },
    {
      "cells": [
        "grzgorz",
        "Wroclawska",
        "skogen",
        "55-098",
        "6565",
        "dania",
        "5555"
      ],
      "line": 11,
      "id": "addresszad1;zalogowanie-wpisanie-adresu-sprawdzenie-adresu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "zalogowanie wpisanie adresu sprawdzenie adresu",
  "description": "",
  "id": "addresszad1;zalogowanie-wpisanie-adresu-sprawdzenie-adresu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "zalogowany na usera z 10minut mail",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "jestem na stronie z kafelkiem Address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "wypelniam formularz grzgorz Wroclawska skogen 55-098 6565 dania 5555",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "sprawdzam czy dane sa ok",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 22
    }
  ],
  "location": "AddressZad1Definition.zalogowanyNaUseraZMinutMail(int)"
});
formatter.result({
  "duration": 14540262200,
  "status": "passed"
});
formatter.match({
  "location": "AddressZad1Definition.jestemNaStronieZKafelkiemAddress()"
});
formatter.result({
  "duration": 1562314100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "AddressZad1Definition.sprawdzamCzyDaneSaOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("EditUserProfile.feature");
formatter.feature({
  "line": 1,
  "name": "Change user information after login",
  "description": "",
  "id": "change-user-information-after-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Change user birthday date, gender and sign up for a newsletter",
  "description": "",
  "id": "change-user-information-after-login;change-user-birthday-date,-gender-and-sign-up-for-a-newsletter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to UserInformationPage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User signs up for our newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User sees \"Information successfully updated.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeUserInfoSteps.userIsLooggedInToCodersLabShop()"
});
formatter.result({
  "duration": 13863799300,
  "status": "passed"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userGoesToInformationPage()"
});
formatter.result({
  "duration": 859306900,
  "status": "passed"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userSignsUpForOurNewsletter()"
});
formatter.result({
  "duration": 4103887900,
  "status": "passed"
});
formatter.match({
  "location": "ChangeUserInfoSteps.userSavesInformation()"
});
formatter.result({
  "duration": 1497964900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Information successfully updated.",
      "offset": 11
    }
  ],
  "location": "ChangeUserInfoSteps.userSees(String)"
});
formatter.result({
  "duration": 139713200,
  "status": "passed"
});
formatter.uri("google-search-text.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword \u003ckeyword\u003e is entered in input field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain \u003cexpectedWord\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;",
  "rows": [
    {
      "cells": [
        "keyword",
        "expectedWord"
      ],
      "line": 10,
      "id": "google-search;user-can-search-any-keyword;;1"
    },
    {
      "cells": [
        "selenium",
        "selenium"
      ],
      "line": 11,
      "id": "google-search;user-can-search-any-keyword;;2"
    },
    {
      "cells": [
        "Robert Lewandowski",
        "Euro 2021"
      ],
      "line": 12,
      "id": "google-search;user-can-search-any-keyword;;3"
    },
    {
      "cells": [
        "elektroda",
        "temat do zamkniecia"
      ],
      "line": 13,
      "id": "google-search;user-can-search-any-keyword;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword selenium is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain selenium",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword Robert Lewandowski is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain Euro 2021",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword elektroda is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain temat do zamkniecia",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});