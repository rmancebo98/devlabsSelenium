@assignment
Feature:This feature class is for all the tests related to the assignment

  Background: I launch the driver
    Given I launch the browser

    @smoke @regression
  Scenario:I open a Chrome Browser and print the title
    Given I print the title

  @smoke @regression
  Scenario: I login with user and password and validate dashboard
    Given I login as user 'admin' with password 'admin123'
    Then I validate the dashboard is present
    And I hover on admin tab
    Then I assert admin options are visible

  @smoke @regression
  Scenario: I login with user and password and validate dashboard and tabs
    Given I login as user 'admin' with password 'admin123'
    Then I validate the dashboard is present
    And I hover on admin tab
    Then I hover sub-tabs and assert options are visible

  @smoke @regression
  Scenario: I read the dashboard using driver.findElement
    Given I login as user 'admin' with password 'admin123'
    Then I read the dashboard and check if text is "Dashboard"
    And I click on admin tab

  @smoke @regression
  Scenario: I read the dashboard using driver.findElement
    Given I login as user 'admin' with password 'admin123'
    Then I read the dashboard and check if text is "Dashboard"
    And I click on admin tab