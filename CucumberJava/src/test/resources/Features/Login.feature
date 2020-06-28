#Author
#Date
#Description

@smokefeature
Feature: Feature to test  login functionality
@smoketest
  Scenario: Check Login is successful with vallid Credentials
    Given user is on Login page
    When user enter username and password
    And Cicks Login Button
    Then user is navigated to HomePage

