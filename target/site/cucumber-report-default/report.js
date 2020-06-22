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
      "value": "#    Then I quit the browser"
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
      "value": "#    And I take the screenshot as \"HomePage1-AliReviewSlide.jpg\""
    },
    {
      "line": 33,
      "value": "#    And I click to Get App button of \"Ali Reviews\" app"
    },
    {
      "line": 34,
      "value": "#    And verify the Ali Reviews install page appears"
    },
    {
      "line": 35,
      "value": "#    And I check the Ali Hunter app from the slider"
    },
    {
      "line": 36,
      "value": "#    And I take the screenshot as \"HomePage2-AliHunterSlide.jpg\""
    },
    {
      "line": 37,
      "value": "#    And I click to Get App button of \"Ali Hunter\" app"
    },
    {
      "line": 38,
      "value": "#    And verify the Ali Hunter install page appears"
    },
    {
      "line": 39,
      "value": "#    And I check the Ali Orders app from the slider"
    },
    {
      "line": 40,
      "value": "#    And I take the screenshot as \"HomePage3-AliOrdersSlide.jpg\""
    },
    {
      "line": 41,
      "value": "#    And I click to Get App button of \"Ali Orders\" app"
    },
    {
      "line": 42,
      "value": "#    And verify the Ali Orders install page appears"
    },
    {
      "line": 43,
      "value": "#    And I check the Sales Box app from the slider"
    },
    {
      "line": 44,
      "value": "#    And I take the screenshot as \"HomePage4-SalesBoxSlide.jpg\""
    },
    {
      "line": 45,
      "value": "#    And I click to Get App button of \"Sales Box\" app"
    },
    {
      "line": 46,
      "value": "#    Then verify the Sales Box install page appears"
    },
    {
      "line": 47,
      "value": "#    And I quit the browser"
    },
    {
      "line": 49,
      "value": "#  Scenario: 03 - Check testimonial slide"
    },
    {
      "line": 50,
      "value": "#    Given I access the website"
    },
    {
      "line": 51,
      "value": "#    When I wait for testimonial slide \"1\" display and take the screenshot"
    },
    {
      "line": 52,
      "value": "#    And I close the messenger pop up"
    },
    {
      "line": 53,
      "value": "#    And I wait for testimonial slide \"2\" display and take the screenshot"
    },
    {
      "line": 54,
      "value": "#    And I wait for testimonial slide \"3\" display and take the screenshot"
    },
    {
      "line": 55,
      "value": "#    And I wait for testimonial slide \"4\" display and take the screenshot"
    },
    {
      "line": 56,
      "value": "#    And I wait for testimonial slide \"5\" display and take the screenshot"
    },
    {
      "line": 57,
      "value": "#    And I wait for testimonial slide \"6\" display and take the screenshot"
    },
    {
      "line": 58,
      "value": "#    And I wait for testimonial slide \"7\" display and take the screenshot"
    },
    {
      "line": 59,
      "value": "#    Then I wait for testimonial slide \"8\" display and take the screenshot"
    },
    {
      "line": 60,
      "value": "#    And I quit the browser"
    },
    {
      "line": 62,
      "value": "#  Scenario: 04 - Check blog posts in Home page"
    },
    {
      "line": 63,
      "value": "#    Given I access the website"
    },
    {
      "line": 64,
      "value": "#    When I close the messenger pop up"
    },
    {
      "line": 65,
      "value": "#    And I check the 1st blog post at Home page work well"
    },
    {
      "line": 66,
      "value": "#    And I return to Home page"
    },
    {
      "line": 67,
      "value": "#    And I check the 2nd blog post at Home page work well"
    },
    {
      "line": 68,
      "value": "#    And I return to Home page"
    },
    {
      "line": 69,
      "value": "#    And I check the 3rd blog post at Home page work well"
    },
    {
      "line": 70,
      "value": "#    And I back to Home page"
    },
    {
      "line": 71,
      "value": "#    And I click to View all blogs link"
    },
    {
      "line": 72,
      "value": "#    Then verify the Blog page has been accessed"
    },
    {
      "line": 73,
      "value": "#    And I quit the browser"
    }
  ],
  "line": 75,
  "name": "05 - Check the footer",
  "description": "",
  "id": "check-functions-for-home-page-fireapps.io;05---check-the-footer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 76,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "I click to \"Shopify Apps\" from the footer",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "verify the Shopify Apps page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "I click to \"New\" from the footer",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "verify the What\u0027s New page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "I back to Home page",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "I click to \"Contact Us\" from the footer",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "verify the Contact Us page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I back to Home page",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I click to \"About Us\" from the footer",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "verify the About Us page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I back to Home page",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I click to \"Help Center\" from the footer",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "verify the Help Center page has been accessed",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "I quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 13492455761,
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
  "duration": 2443568881,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_shopify_apps_page_has_been_accessed()"
});
formatter.result({
  "duration": 1018900830,
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
  "duration": 3544057188,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_whats_new_page_has_been_accessed()"
});
formatter.result({
  "duration": 41982276,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_back_to_home_page()"
});
formatter.result({
  "duration": 725175982,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.i_click_to_something_from_the_footer(String)"
});
formatter.result({
  "duration": 30161100450,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //a[@class\u003d\u0027nav-link\u0027 and contains(text(), \u0027Contact Us\u0027)] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027TAM-NGUYEN\u0027, ip: \u0027192.168.0.122\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50405}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d7be55a95b2021000c7e2258bb1e7d2e\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat commons.AbstractPage.waitToElementClickable(AbstractPage.java:360)\r\n\tat pageObject.WebsitePO.clickToFooterMenus(WebsitePO.java:115)\r\n\tat stepDefinitions.WebsiteSteps.i_click_to_something_from_the_footer(WebsiteSteps.java:304)\r\n\tat ✽.And I click to \"Contact Us\" from the footer(WebsiteTestcases.feature:82)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_contact_us_page_has_been_accessed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_back_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "About Us",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.i_click_to_something_from_the_footer(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_about_us_page_has_been_accessed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_back_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Help Center",
      "offset": 12
    }
  ],
  "location": "WebsiteSteps.i_click_to_something_from_the_footer(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.verify_the_help_center_page_has_been_accessed()"
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