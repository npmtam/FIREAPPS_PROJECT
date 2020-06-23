$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WhatsNewPage.feature");
formatter.feature({
  "line": 2,
  "name": "Check functions for What\u0027s New page on Fireapps.io",
  "description": "As a user\r\nI want to check all functions of What\u0027s New page",
  "id": "check-functions-for-what\u0027s-new-page-on-fireapps.io",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WhatsNewPage"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  Scenario: 01 - Check lazy load"
    },
    {
      "line": 7,
      "value": "#    Given I access the website"
    },
    {
      "line": 8,
      "value": "#    When I click to \"New\" from the footer"
    },
    {
      "line": 9,
      "value": "#    And verify the What\u0027s New page has been accessed"
    },
    {
      "line": 10,
      "value": "#    And verify the loading wheel is displayed if there are more than 4 posts"
    },
    {
      "line": 11,
      "value": "#    And verify the text label display after scroll to the end of page"
    },
    {
      "line": 12,
      "value": "#    Then I quit the browser"
    }
  ],
  "line": 14,
  "name": "02 - Check filter by apps checkboxes",
  "description": "",
  "id": "check-functions-for-what\u0027s-new-page-on-fireapps.io;02---check-filter-by-apps-checkboxes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click to \"New\" from the footer",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verify the What\u0027s New page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on the \"Ali Review\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify that only the posts of \"Ali Reviews\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on back to all changes button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on the \"Ali Hunter\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "verify that only the posts of \"Ali Hunter\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on back to all changes button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on the \"Ali Orders\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "verify that only the posts of \"Ali Orders\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on back to all changes button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on the \"Sales Box\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify that only the posts of \"Sales Box\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on back to all changes button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 8181137343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.i_click_to_something_from_the_footer(String)"
});
formatter.result({
  "duration": 3787963535,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_whats_new_page_has_been_accessed()"
});
formatter.result({
  "duration": 46139098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Review",
      "offset": 16
    }
  ],
  "location": "WebsiteSteps.i_click_on_the_something_checkbox(String)"
});
formatter.result({
  "duration": 1000231139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Reviews",
      "offset": 31
    }
  ],
  "location": "WebsiteSteps.verify_that_only_the_posts_of_something_displayed(String)"
});
formatter.result({
  "duration": 239177835,
  "error_message": "java.lang.NullPointerException\r\n\tat commons.AbstractTest.checkTrue(AbstractTest.java:123)\r\n\tat commons.AbstractTest.verifyTrue(AbstractTest.java:130)\r\n\tat stepDefinitions.WebsiteSteps.verify_that_only_the_posts_of_something_displayed(WebsiteSteps.java:421)\r\n\tat ✽.And verify that only the posts of \"Ali Reviews\" displayed(WhatsNewPage.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WebsiteSteps.i_click_on_back_to_all_changes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Hunter",
      "offset": 16
    }
  ],
  "location": "WebsiteSteps.i_click_on_the_something_checkbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Hunter",
      "offset": 31
    }
  ],
  "location": "WebsiteSteps.verify_that_only_the_posts_of_something_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_click_on_back_to_all_changes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Orders",
      "offset": 16
    }
  ],
  "location": "WebsiteSteps.i_click_on_the_something_checkbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Orders",
      "offset": 31
    }
  ],
  "location": "WebsiteSteps.verify_that_only_the_posts_of_something_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_click_on_back_to_all_changes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sales Box",
      "offset": 16
    }
  ],
  "location": "WebsiteSteps.i_click_on_the_something_checkbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sales Box",
      "offset": 31
    }
  ],
  "location": "WebsiteSteps.verify_that_only_the_posts_of_something_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_click_on_back_to_all_changes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});