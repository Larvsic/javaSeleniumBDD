$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/MicrosoftFlow.feature");
formatter.feature({
  "line": 2,
  "name": "Microsoft flow page",
  "description": "",
  "id": "microsoft-flow-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@microsoft"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Happy Path",
  "description": "",
  "id": "microsoft-flow-page;happy-path",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I launch \"https://www.microsoft.com/en-us/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User validate all menu items are present",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User go to Windows",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Windows 10 Menu and print values",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User go to Search next to the shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User search for \"Visual Studio\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on the first one to go to the details page and Validate prices",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click Add To Cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all 3 price amounts are the same",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select 20 items",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Validate new amount of price",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_launch()"
});
formatter.result({
  "duration": 9056072400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.microsoft.com/en-us/",
      "offset": 10
    }
  ],
  "location": "Steps.navigates_url(String)"
});
formatter.result({
  "duration": 5318855100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_validate_all_menu_items_are_present()"
});
formatter.result({
  "duration": 606087900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_go_to_windows()"
});
formatter.result({
  "duration": 6313043800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_windows_menu()"
});
formatter.result({
  "duration": 6067653300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_go_to_search_next_to_the_shopping_cart()"
});
formatter.result({
  "duration": 197804400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Visual Studio",
      "offset": 17
    }
  ],
  "location": "Steps.user_search_for(String)"
});
formatter.result({
  "duration": 8392536600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_the_first_one_to_go_to_the_details_page()"
});
formatter.result({
  "duration": 6808164800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_add_to_cart()"
});
formatter.result({
  "duration": 3131674300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_all_price_amounts_are_the_same()"
});
formatter.result({
  "duration": 12177357500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.selectItems()"
});
formatter.result({
  "duration": 3536728100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validateAmount()"
});
formatter.result({
  "duration": 8092629900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.closingBrowser()"
});
formatter.result({
  "duration": 1513523300,
  "status": "passed"
});
});