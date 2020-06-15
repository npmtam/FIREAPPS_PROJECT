$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WebsiteTestcases.feature");
formatter.feature({
  "line": 2,
  "name": "Check functions for Home page Fireapps.io",
  "description": "As a user\r\nI want to check all functions of Home page",
  "id": "check-functions-for-home-page-fireapps.io",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  Scenario: 01 - Check the Header"
    },
    {
      "line": 7,
      "value": "#    Given I access the website"
    },
    {
      "line": 8,
      "value": "#    When I access the \"Home\" from header"
    },
    {
      "line": 9,
      "value": "#    And verify the Home page has been accessed"
    },
    {
      "line": 10,
      "value": "#    And I take the screenshot as \"Header1-Home.jpg\""
    },
    {
      "line": 11,
      "value": "#    And I close the messenger pop up"
    },
    {
      "line": 12,
      "value": "#    And I access the \"SHOPIFY APPS\" from header"
    },
    {
      "line": 13,
      "value": "#    And verify the Shopify Apps page has been accessed"
    },
    {
      "line": 14,
      "value": "#    And I take the screenshot as \"Header2-ShopifyApps.jpg\""
    },
    {
      "line": 15,
      "value": "#    And I access the \"Blog\" from header"
    },
    {
      "line": 16,
      "value": "#    And verify the Blog page has been accessed"
    },
    {
      "line": 17,
      "value": "#    And I take the screenshot as \"Header3-Blog.jpg\""
    },
    {
      "line": 18,
      "value": "#    And I access the \"Affiliate\" from header"
    },
    {
      "line": 19,
      "value": "#    And verify the Affiliate page has been accessed"
    },
    {
      "line": 20,
      "value": "#    And I access the \"Get App Now\" from header"
    },
    {
      "line": 21,
      "value": "#    And verify the FireApps app store has been accessed"
    },
    {
      "line": 22,
      "value": "#    And I take the screenshot as \"Header5-GetAppNow.jpg\""
    },
    {
      "line": 23,
      "value": "#    Then I return to Home page"
    },
    {
      "line": 25,
      "value": "#  Scenario: 02 - Check Apps list slide bar"
    },
    {
      "line": 26,
      "value": "#    Given I access the website"
    },
    {
      "line": 27,
      "value": "#    When I click on Get App Now button"
    },
    {
      "line": 28,
      "value": "#    And verify the Shopify Apps page has been accessed"
    },
    {
      "line": 29,
      "value": "#    And I access the \"Home\" from header"
    },
    {
      "line": 30,
      "value": "#    And I close the messenger pop up"
    },
    {
      "line": 31,
      "value": "#    And I check the Ali Review app from the slider"
    },
    {
      "line": 32,
      "value": "#    And verify the Previous button is disabled"
    },
    {
      "line": 33,
      "value": "#    And I take the screenshot as \"HomePage1-AliReviewSlide.jpg\""
    },
    {
      "line": 34,
      "value": "#    And I click to Get App button of \"Ali Reviews\" app"
    },
    {
      "line": 35,
      "value": "#    And verify the \"Ali Reviews\" install page appears"
    },
    {
      "line": 36,
      "value": "#    And I check the Ali Hunter app from the slider"
    },
    {
      "line": 37,
      "value": "#    And I take the screenshot as \"HomePage2-AliHunterSlide.jpg\""
    },
    {
      "line": 38,
      "value": "#    And I click to Get App button of \"Ali Hunter\" app"
    },
    {
      "line": 39,
      "value": "#    And verify the \"Ali Hunter\" install page appears"
    },
    {
      "line": 40,
      "value": "#    And I check the Ali Orders app from the slider"
    },
    {
      "line": 41,
      "value": "#    And I take the screenshot as \"HomePage3-AliOrdersSlide.jpg\""
    },
    {
      "line": 42,
      "value": "#    And I click to Get App button of \"Ali Orders\" app"
    },
    {
      "line": 43,
      "value": "#    And verify the \"Ali Orders\" install page appears"
    },
    {
      "line": 44,
      "value": "#    And I check the Sales Box app from the slider"
    },
    {
      "line": 45,
      "value": "#    And verify the Next button is disabled"
    },
    {
      "line": 46,
      "value": "#    And I take the screenshot as \"HomePage4-SalesBoxSlide.jpg\""
    },
    {
      "line": 47,
      "value": "#    And I click to Get App button of \"Sales Box\" app"
    },
    {
      "line": 48,
      "value": "#    Then verify the \"Sales Box\" install page appears"
    },
    {
      "line": 50,
      "value": "#  Scenario: 03 - Check testimonial slide"
    },
    {
      "line": 51,
      "value": "#    Given I access the website"
    },
    {
      "line": 52,
      "value": "#    When I wait for testimonial slide \"1\" display and take the screenshot"
    },
    {
      "line": 53,
      "value": "#    And I close the messenger pop up"
    },
    {
      "line": 54,
      "value": "#    And I wait for testimonial slide \"2\" display and take the screenshot"
    },
    {
      "line": 55,
      "value": "#    And I wait for testimonial slide \"3\" display and take the screenshot"
    },
    {
      "line": 56,
      "value": "#    And I wait for testimonial slide \"4\" display and take the screenshot"
    },
    {
      "line": 57,
      "value": "#    And I wait for testimonial slide \"5\" display and take the screenshot"
    },
    {
      "line": 58,
      "value": "#    And I wait for testimonial slide \"6\" display and take the screenshot"
    },
    {
      "line": 59,
      "value": "#    And I wait for testimonial slide \"7\" display and take the screenshot"
    },
    {
      "line": 60,
      "value": "#    Then I wait for testimonial slide \"8\" display and take the screenshot"
    }
  ],
  "line": 62,
  "name": "04 - Check blog posts in Home page",
  "description": "",
  "id": "check-functions-for-home-page-fireapps.io;04---check-blog-posts-in-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 63,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "I close the messenger pop up",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "I check the 1st blog post at Home page work well",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I return to Home page",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I check the 2nd blog post at Home page work well",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "I return to Home page",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "I check the 3rd blog post at Home page work well",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I back to Home page",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "I click to View all blogs link",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "verify the Blog page has been accessed",
  "keyword": "Then "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 8108150972,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_close_the_messenger_pop_up()"
});
formatter.result({
  "duration": 3328466018,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_1st_blog_post_at_home_page_work_well()"
});
formatter.result({
  "duration": 2310703675,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_return_to_home_page()"
});
formatter.result({
  "duration": 1851925735,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_2nd_blog_post_at_home_page_work_well()"
});
formatter.result({
  "duration": 1049152815,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_return_to_home_page()"
});
formatter.result({
  "duration": 2327812836,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_3rd_blog_post_at_home_page_work_well()"
});
formatter.result({
  "duration": 1603142496,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_back_to_home_page()"
});
formatter.result({
  "duration": 1273026897,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_click_to_view_all_blogs_link()"
});
formatter.result({
  "duration": 612605208,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_blog_page_has_been_accessed()"
});
formatter.result({
  "duration": 2041642256,
  "status": "passed"
});
formatter.scenario({
  "line": 74,
  "name": "05 - Check the footer",
  "description": "",
  "id": "check-functions-for-home-page-fireapps.io;05---check-the-footer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 75,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "I click to \"Shopify Apps\" from the footer",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "verify the Shopify Apps page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "I click to \"New\" from the footer",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "verify the What\u0027s New page has been accessed",
  "keyword": "And "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 6739510816,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopify Apps",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.i_click_to_something_from_the_footer(String)"
});
formatter.result({
  "duration": 2190136101,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_shopify_apps_page_has_been_accessed()"
});
formatter.result({
  "duration": 1561233384,
  "error_message": "java.lang.NullPointerException\r\n\tat commons.AbstractTest.checkTrue(AbstractTest.java:123)\r\n\tat commons.AbstractTest.verifyTrue(AbstractTest.java:130)\r\n\tat stepDefinitions.WebsiteSteps.verify_the_shopify_apps_page_has_been_accessed(WebsiteSteps.java:59)\r\n\tat ✽.And verify the Shopify Apps page has been accessed(WebsiteTestcases.feature:77)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_whats_new_page_has_been_accessed()"
});
formatter.result({
  "status": "skipped"
});
});