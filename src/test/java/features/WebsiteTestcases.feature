@HomePage
Feature: Check functions for Home page Fireapps.io
  As a user
  I want to check all functions of Home page

  Scenario: 01 - Check the Header
    Given I access the website
    When I access the "Home" from header
    And verify the Home page has been accessed
    And I take the screenshot as "Header1-Home.jpg"
    And I close the messenger pop up
    And I access the "SHOPIFY APPS" from header
    And verify the Shopify Apps page has been accessed
    And I take the screenshot as "Header2-ShopifyApps.jpg"
    And I access the "Blog" from header
    And verify the Blog page has been accessed
    And I take the screenshot as "Header3-Blog.jpg"
    And I access the "Affiliate" from header
    And verify the Affiliate page has been accessed
    And I access the "Get App Now" from header
    And verify the FireApps app store has been accessed
    And I take the screenshot as "Header5-GetAppNow.jpg"
    Then I return to Home page

  Scenario: 02 - Check body of Home Page
    Given I access the website
    When I click on Get App Now button
    And verify the Shopify Apps page has been accessed
    And I access the "Home" from header
#    And I close the messenger pop up
    And I check the Ali Review app from the slider
    And verify the previous button is disabled
    And I take the screenshot as "HomePage1-AliReviewSlide.jpg"
    And I click to Get App button of "Ali Reviews" app
    And verify the "Ali Reviews" install page appears
    And I check the Ali Hunter app from the slider
    And I take the screenshot as "HomePage2-AliHunterSlide.jpg"
    And I click to Get App button of "Ali Hunter" app
    And verify the "Ali Hunter" install page appears
    And I check the Ali Orders app from the slider
    And I take the screenshot as "HomePage3-AliOrdersSlide.jpg"
    And I click to Get App button of "Ali Orders" app
    And verify the "Ali Orders" install page appears
    And I check the Sales Box app from the slider
    And I take the screenshot as "HomePage4-SalesBoxSlide.jpg"
    And I click to Get App button of "Sales Box" app
    And verify the "Sales Box" install page appears
    