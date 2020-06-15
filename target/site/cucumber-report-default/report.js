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
    }
  ],
  "line": 50,
  "name": "03 - Check testimonial slide",
  "description": "",
  "id": "check-functions-for-home-page-fireapps.io;03---check-testimonial-slide",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "I access the website",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "I close the messenger pop up",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "I wait for testimonial slide \"1\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I wait for testimonial slide \"2\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I wait for testimonial slide \"3\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I wait for testimonial slide \"4\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I wait for testimonial slide \"5\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I wait for testimonial slide \"6\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I wait for testimonial slide \"7\" display and take the screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I wait for testimonial slide \"8\" display and take the screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 9930135058,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_close_the_messenger_pop_up()"
});
formatter.result({
  "duration": 1872702730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "duration": 30100836655,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //div[@class\u003d\u0027swiper-slide-content swiper-slide swiper-slide-active\u0027 and @data-swiper-slide-index\u003d\u00270\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat commons.AbstractPage.waitToElementVisible(AbstractPage.java:340)\r\n\tat pageObject.WebsitePO.waitForMapSlideAndTakeTheScrShot(WebsitePO.java:215)\r\n\tat stepDefinitions.WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(WebsiteSteps.java:193)\r\n\tat ✽.And I wait for testimonial slide \"1\" display and take the screenshot(WebsiteTestcases.feature:53)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027swiper-slide-content swiper-slide swiper-slide-active\u0027 and @data-swiper-slide-index\u003d\u00270\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027TAM-NGUYEN\u0027, ip: \u0027192.168.0.133\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51683}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9f710ceed5e66ac60e6b3bbd20071471\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027swiper-slide-content swiper-slide swiper-slide-active\u0027 and @data-swiper-slide-index\u003d\u00270\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat commons.AbstractPage.waitToElementVisible(AbstractPage.java:340)\r\n\tat pageObject.WebsitePO.waitForMapSlideAndTakeTheScrShot(WebsitePO.java:215)\r\n\tat stepDefinitions.WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(WebsiteSteps.java:193)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 30
    }
  ],
  "location": "WebsiteSteps.i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
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
  "keyword": "Then "
});
formatter.match({
  "location": "WebsiteSteps.i_access_the_website()"
});
formatter.result({
  "duration": 4784897677,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteSteps.i_close_the_messenger_pop_up()"
});
formatter.result({
  "duration": 1004279138,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d83.0.4103.97)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027TAM-NGUYEN\u0027, ip: \u0027192.168.0.133\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51858}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 34635381a1065954bf02b81289db70ea\n*** Element info: {Using\u003dxpath, value\u003d//iframe[contains(@src, \u0027customerchat\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat commons.AbstractPage.switchToFrameOrIframe(AbstractPage.java:281)\r\n\tat pageObject.WebsitePO.clickToCloseMessenger(WebsitePO.java:375)\r\n\tat stepDefinitions.WebsiteSteps.i_close_the_messenger_pop_up(WebsiteSteps.java:52)\r\n\tat ✽.When I close the messenger pop up(WebsiteTestcases.feature:64)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_1st_blog_post_at_home_page_work_well()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_return_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_2nd_blog_post_at_home_page_work_well()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_return_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebsiteSteps.i_check_the_3rd_blog_post_at_home_page_work_well()"
});
formatter.result({
  "status": "skipped"
});
});