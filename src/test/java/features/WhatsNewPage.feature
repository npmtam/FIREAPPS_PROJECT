@WhatsNewPage
Feature: Check functions for What's New page on Fireapps.io
  As a user
  I want to check all functions of What's New page

#  Scenario: 01 - Check lazy load
#    Given I access the website
#    When I click to "New" from the footer
#    And verify the What's New page has been accessed
#    And verify the loading wheel is displayed if there are more than 4 posts
#    And verify the text label display after scroll to the end of page
#    Then I quit the browser

  Scenario: 02 - Check filter by apps checkboxes
    Given I access the website
    When I click to "New" from the footer
    And verify the What's New page has been accessed
    And I click on the "Ali Review" checkbox
    And verify that only the posts of "Ali Reviews" displayed
    And I click on back to all changes button
    And I click on the "Ali Hunter" checkbox
    And verify that only the posts of "Ali Hunter" displayed
    And I click on back to all changes button
    And I click on the "Ali Orders" checkbox
    And verify that only the posts of "Ali Orders" displayed
    And I click on back to all changes button
    And I click on the "Sales Box" checkbox
    And verify that only the posts of "Sales Box" displayed
    And I click on back to all changes button
    Then I quit the browser

