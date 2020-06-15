package stepDefinitions;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources;
import commons.AbstractPage;
import commons.AbstractTest;
import commons.Constants;
import commons.PageGeneratorManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.WebsitePO;
import pageUI.WebsiteUI;

public class WebsiteSteps extends AbstractTest {
    WebDriver driver;
    WebsitePO websitePage;
    AbstractPage abstractPage;

    public WebsiteSteps() {
        driver = Hooks.openBrowser();
        websitePage = new WebsitePO(driver);
        abstractPage = new AbstractPage(driver);
    }

    @Given("^I access the website$")
    public void i_access_the_website() {
        driver.get(Constants.WEBSITE_URL);
//        websitePage = PageGeneratorManager.getWebsitePage(driver);
    }

    @When("^I access the \"([^\"]*)\" from header$")
    public void i_access_the_something_from_header(String headerMenu) {
        websitePage.clickToHeaderDynamic(headerMenu);
    }

    @And("^verify the Home page has been accessed$")
    public void verify_the_home_page_has_been_accessed() {
        abstractPage.switchToWindowsByTitle("Home Page - Fireapps");
        verifyTrue(websitePage.isHomePageAccessed());
    }

    @And("^I take the screenshot as \"([^\"]*)\"$")
    public void i_take_the_screenshot_as_something(String fileName) {
        abstractPage.takeScreenshot(fileName);
    }

    @And("^I close the messenger pop up$")
    public void i_close_the_messenger_pop_up() {
            websitePage.clickToCloseMessenger();
    }

    @And("^verify the Shopify Apps page has been accessed$")
    public void verify_the_shopify_apps_page_has_been_accessed() {
        verifyEquals(websitePage.isShopifyAppsPageAccessed(), Constants.WEBSITE_SHOPIFY_APPS);
    }

    @And("^verify the Blog page has been accessed$")
    public void verify_the_blog_page_has_been_accessed() {
        verifyTrue(websitePage.isBlogPageAccessed());
    }

    @And("^verify the Affiliate page has been accessed$")
    public void verify_the_affiliate_page_has_been_accessed() {
        verifyTrue(websitePage.isAffiliateTabAccessed());
        abstractPage.takeScreenshot("Header4-Affiliate.jpg");
        abstractPage.switchToWindowsByTitle("Blog - Fireapps");
        verifyTrue(websitePage.isBlogPageAccessed());
    }

    @And("^verify the FireApps app store has been accessed$")
    public void verify_the_fireapps_app_store_has_been_accessed() {
        abstractPage.switchToWindowsByTitle("Apps by FireApps - Premium Apps on the Shopify App Store");
        verifyTrue(websitePage.isShopifyAppStoreFireAppsDisplayed());
    }

    @Then("^I return to Home page$")
    public void i_return_to_home_page() {
        abstractPage.switchToWindowsByTitle("Blog - Fireapps");
        websitePage.clickToHeaderDynamic(Constants.WEBSITE_HOME_BUTTON);
        abstractPage.switchToWindowsByTitle("Home Page - Fireapps");
        verifyTrue(websitePage.isHomePageAccessed());
    }

    @When("^I click on Get App Now button$")
    public void i_click_on_get_app_now_button() {
        websitePage.clickToBodyGetAppNow();
    }

    @And("^I check the Ali Review app from the slider$")
    public void i_check_the_ali_review_app_from_the_slider() {
        websitePage.scrollToAppSlideBar();
        abstractPage.sleepInSecond(1);
        verifyTrue(websitePage.isAppLogoDisplayedAfterSelectSlidebar("alireviews"));
    }

    @And("^verify the Previous button is disabled$")
    public void verify_the_Previous_button_is_disabled() {
        verifyEquals(websitePage.isPrevSlideButtonDisabled(), "true");
    }

    @And("^verify the Next button is disabled$")
    public void verify_the_next_button_is_disabled() {
        verifyEquals(websitePage.isNextSlideButtonDisabled(), "true");
    }

    @And("^I click to Get App button of \"([^\"]*)\" app$")
    public void i_click_to_get_app_button_of_something_app(String app) {
        switch (app) {
            case "Ali Reviews":
                websitePage.clickToGetAppButtonInSlidebar(Constants.ALI_REVIEW_GET_APP);
                break;
            case "Ali Orders":
                websitePage.clickToGetAppButtonInSlidebar(Constants.ALI_ORDERS_GET_APP);
                break;
            case "Ali Hunter":
                websitePage.clickToGetAppButtonInSlidebar(Constants.ALI_HUNTER_GET_APP);
                break;
            case "Sales Box":
                websitePage.clickToGetAppButtonInSlidebar(Constants.SALES_BOX_GET_APP);
                break;
        }
    }

    @And("^verify the \"([^\"]*)\" install page appears$")
    public void verify_the_something_install_page_appears(String app) {
        switch (app) {
            case "Ali Reviews":
                abstractPage.switchToWindowsByTitle("Ali Reviews – Import AliExpress Reviews to Shopify Store - FireApps");
                abstractPage.sleepInSecond(1);
                verifyTrue(websitePage.isGetAppPageAccessed(Constants.WEBSITE_ALI_REVIEW_URL));
//                driver.get(Constants.WEBSITE_URL);
                abstractPage.switchToWindowsByTitle(Constants.HOME_PAGE_TITLE);
                break;
            case "Ali Hunter":
                abstractPage.switchToWindowsByTitle("Ali Hunter - FireApps");
                abstractPage.sleepInSecond(1);
                verifyTrue(websitePage.isGetAppPageAccessed(Constants.WEBSITE_ALI_HUNTER_URL));
//                driver.get(Constants.WEBSITE_URL);
                abstractPage.switchToWindowsByTitle(Constants.HOME_PAGE_TITLE);
                break;
            case "Ali Orders":
                abstractPage.switchToWindowsByTitle("Ali Orders – Automate Your AliExpress Dropshipping Business - FireApps");
                abstractPage.sleepInSecond(1);
                verifyTrue(websitePage.isGetAppPageAccessed(Constants.WEBSITE_ALI_ORDERS_URL));
//                driver.get(Constants.WEBSITE_URL);
                abstractPage.switchToWindowsByTitle(Constants.HOME_PAGE_TITLE);
                break;
            case "Sales Box":
                abstractPage.switchToWindowsByTitle("Sales Box - FireApps");
                abstractPage.sleepInSecond(1);
                verifyTrue(websitePage.isGetAppPageAccessed(Constants.WEBSITE_SALES_BOX_URL));
//                driver.get(Constants.WEBSITE_URL);
                abstractPage.switchToWindowsByTitle(Constants.HOME_PAGE_TITLE);
                break;
        }
    }

    @And("^I check the Ali Hunter app from the slider$")
    public void i_check_the_ali_hunter_app_from_the_slider() {
        websitePage.scrollToAppSlideBar();
        websitePage.clickToNextAppSlide();
        abstractPage.sleepInSecond(1);
        verifyTrue(websitePage.isAppLogoDisplayedAfterSelectSlidebar("alihunter"));
    }

    @And("^I check the Ali Orders app from the slider$")
    public void i_check_the_ali_orders_app_from_the_slider() {
        abstractPage.sleepInSecond(1);
        websitePage.scrollToAppSlideBar();
        websitePage.clickToNextAppSlide();
        abstractPage.sleepInSecond(1);
        verifyTrue(websitePage.isAppLogoDisplayedAfterSelectSlidebar("aliorders"));
    }

    @And("^I check the Sales Box app from the slider$")
    public void i_check_the_sales_box_app_from_the_slider() {
        websitePage.scrollToAppSlideBar();
        websitePage.clickToNextAppSlide();
        abstractPage.sleepInSecond(1);
        verifyTrue(websitePage.isAppLogoDisplayedAfterSelectSlidebar("salesbox"));
    }

    @And("^I wait for testimonial slide \"([^\"]*)\" display and take the screenshot$")
    public void i_wait_for_testimonial_slide_something_display_and_take_the_screenshot(String slideNum) {
        abstractPage.scrollToElement(WebsiteUI.DOT_ICON_TO_MOVE_SLIDE_APP, "1");
        String indexValue;
        switch (slideNum) {
            case "1":
                indexValue = "0";
                websitePage.waitForMapSlideAndTakeTheScrShot("0", "HomePage5-AliReviewMap0.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage5-AliReviewMap1.jpg");
                break;
            case "2":
                indexValue = "1";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage6-AliOrderMap1.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage6-AliOrderMap1.jpg");
                break;
            case "3":
                indexValue = "2";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage7-SalesBoxMap2.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage7-SalesBoxMap2.jpg");
                break;
            case "4":
                indexValue = "3";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage8-AliHunterMap3.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage8-AliHunterMap3.jpg");
                break;
            case "5":
                indexValue = "4";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage9-AliReviewMap4.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage9-AliReviewMap4.jpg");
                break;
            case "6":
                indexValue = "5";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage10-AliOrdersMap5.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage10-AliOrdersMap5.jpg");
                break;
            case "7":
                indexValue = "6";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage11-SalesBoxMap6.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage11-SalesBoxMap6.jpg");
                break;
            case "8":
                indexValue = "7";
                websitePage.waitForMapSlideAndTakeTheScrShot(indexValue, "HomePage12-AliHunterMap7.jpg");
//                abstractPage.waitToElementVisible(WebsiteUI.MAP_SLIDEBAR, indexValue);
//                verifyTrue(abstractPage.isElementDisplayed(WebsiteUI.MAP_SLIDEBAR, indexValue));
//                abstractPage.takeScreenshot("HomePage12-AliHunterMap7.jpg");
                break;
        }
    }

    @And("^I back to Home page$")
    public void i_back_to_home_page() {
        driver.get(Constants.WEBSITE_URL);
    }

    @And("^I check the 1st blog post at Home page work well$")
    public void i_check_the_1st_blog_post_at_home_page_work_well()  {
        verifyTrue(websitePage.checkBlogPostAtHomePage("1"));
    }

    @And("^I check the 2nd blog post at Home page work well$")
    public void i_check_the_2nd_blog_post_at_home_page_work_well()  {
        verifyTrue(websitePage.checkBlogPostAtHomePage("2"));
    }

    @And("^I check the 3rd blog post at Home page work well$")
    public void i_check_the_3rd_blog_post_at_home_page_work_well()  {
        verifyTrue(websitePage.checkBlogPostAtHomePage("3"));
    }

}

