Feature: Insurance page and Tesla app link Test

  Background:
    Given Open website go to home page
    Given Go to Insurance page
    When Verify that you are on the Insurance page

  Scenario: Insurance page test
    And Check that the Safety Score on the page is working
    And Check that the Easy Access on the page is working

  Scenario: Tesla app link test
    Given Click Get Insurance and go to the page
    And Click on the Google Play Store and switch to the page
    And Verify that the app is on Google Play and return to the home page
    And Click on the Apple App Store and switch to the page
    And Verify that the app is on Apple Store and return to the home page
    Then Close open pages