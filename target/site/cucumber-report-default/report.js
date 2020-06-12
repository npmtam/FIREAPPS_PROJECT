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
  "line": 6,
  "name": "01 - Check the Header",
  "description": "",
  "id": "check-functions-for-home-page-fireapps.io;01---check-the-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I access the \"Home\" from header",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify the Home page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I take the screenshot as \"Header1-Home.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close the messenger pop up",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I access the \"SHOPIFY APPS\" from header",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify the Shopify Apps page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I take the screenshot as \"Header2-ShopifyApps.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I access the \"Blog\" from header",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify the Blog page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I take the screenshot as \"Header3-Blog.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I access the \"Affiliate\" from header",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify the Affiliate page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I access the \"Get App Now\" from header",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify the FireApps app store has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I take the screenshot as \"Header5-GetAppNow.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I return to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 8412325500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 14
    }
  ],
  "location": "WebsiteSteps.i_access_the_something_from_header(String)"
});
formatter.result({
  "duration": 275759100,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_home_page_has_been_accessed()"
});
formatter.result({
  "duration": 2051981500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Header1-Home.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "duration": 473960700,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_close_the_messenger_pop_up()"
});
formatter.result({
  "duration": 1206562800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SHOPIFY APPS",
      "offset": 14
    }
  ],
  "location": "WebsiteSteps.i_access_the_something_from_header(String)"
});
formatter.result({
  "duration": 1042609100,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_shopify_apps_page_has_been_accessed()"
});
formatter.result({
  "duration": 1007608500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Header2-ShopifyApps.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "duration": 375550400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blog",
      "offset": 14
    }
  ],
  "location": "WebsiteSteps.i_access_the_something_from_header(String)"
});
formatter.result({
  "duration": 1863636500,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_blog_page_has_been_accessed()"
});
formatter.result({
  "duration": 2026652300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Header3-Blog.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "duration": 436842400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Affiliate",
      "offset": 14
    }
  ],
  "location": "WebsiteSteps.i_access_the_something_from_header(String)"
});
formatter.result({
  "duration": 92781200,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_affiliate_page_has_been_accessed()"
});
formatter.result({
  "duration": 4962117000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Get App Now",
      "offset": 14
    }
  ],
  "location": "WebsiteSteps.i_access_the_something_from_header(String)"
});
formatter.result({
  "duration": 112462900,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_fireapps_app_store_has_been_accessed()"
});
formatter.result({
  "duration": 2996746000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Header5-GetAppNow.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "duration": 325998900,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_return_to_home_page()"
});
formatter.result({
  "duration": 1155815600,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "02 - Check body of Home Page",
  "description": "",
  "id": "check-functions-for-home-page-fireapps.io;02---check-body-of-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click on Get App Now button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "verify the Shopify Apps page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I access the \"Home\" from header",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#    And I close the messenger pop up"
    }
  ],
  "line": 31,
  "name": "I check the Ali Review app from the slider",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "verify the previous button is disabled",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I take the screenshot as \"HomePage1-AliReviewSlide.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click to Get App button of \"Ali Reviews\" app",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "verify the \"Ali Reviews\" install page appears",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I check the Ali Hunter app from the slider",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I take the screenshot as \"HomePage2-AliHunterSlide.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click to Get App button of \"Ali Hunter\" app",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "verify the \"Ali Hunter\" install page appears",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I check the Ali Orders app from the slider",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I take the screenshot as \"HomePage3-AliOrdersSlide.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click to Get App button of \"Ali Orders\" app",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "verify the \"Ali Orders\" install page appears",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I check the Sales Box app from the slider",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I take the screenshot as \"HomePage4-SalesBoxSlide.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click to Get App button of \"Sales Box\" app",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "verify the \"Sales Box\" install page appears",
  "keyword": "And "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 7179790400,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_click_on_get_app_now_button()"
});
formatter.result({
  "duration": 214092700,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_shopify_apps_page_has_been_accessed()"
});
formatter.result({
  "duration": 2279610100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 14
    }
  ],
  "location": "WebsiteSteps.i_access_the_something_from_header(String)"
});
formatter.result({
  "duration": 837426500,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_ali_review_app_from_the_slider()"
});
formatter.result({
  "duration": 1053762200,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_previous_button_is_disabled()"
});
formatter.result({
  "duration": 20034000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage1-AliReviewSlide.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "duration": 388836600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Reviews",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_click_to_get_app_button_of_something_app(String)"
});
formatter.result({
  "duration": 1523076700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Reviews",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.verify_the_something_install_page_appears(String)"
});
formatter.result({
  "duration": 3985807100,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_ali_hunter_app_from_the_slider()"
});
formatter.result({
  "duration": 1134008600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage2-AliHunterSlide.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "duration": 382712000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Hunter",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_click_to_get_app_button_of_something_app(String)"
});
formatter.result({
  "duration": 292077900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Hunter",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.verify_the_something_install_page_appears(String)"
});
formatter.result({
  "duration": 2004972800,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_ali_orders_app_from_the_slider()"
});
formatter.result({
  "duration": 2171147400,
  "error_message": "java.lang.NullPointerException\r\n\tat commons.AbstractTest.checkTrue(AbstractTest.java:123)\r\n\tat commons.AbstractTest.verifyTrue(AbstractTest.java:130)\r\n\tat stepDefinitions.WebsiteSteps.i_check_the_ali_orders_app_from_the_slider(WebsiteSteps.java:170)\r\n\tat ✽.And I check the Ali Orders app from the slider(WebsiteTestcases.feature:40)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage3-AliOrdersSlide.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Orders",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_click_to_get_app_button_of_something_app(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ali Orders",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.verify_the_something_install_page_appears(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_sales_box_app_from_the_slider()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage4-SalesBoxSlide.jpg",
      "offset": 26
    }
  ],
  "location": "WebsiteSteps.i_take_the_screenshot_as_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sales Box",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_click_to_get_app_button_of_something_app(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sales Box",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.verify_the_something_install_page_appears(String)"
});
formatter.result({
  "status": "skipped"
});
});