@CRMmain
Feature: CRM
  As a user, I want to go to CRM tab page

  Background:  On the login page
    Given user is on the login page


  Scenario: user navigates to <tab_name> tab
    Then user enter "eventscrmmanager50@info.com" and "eventscrmmanager"
    And user navigates to following page:
    |CRM|



