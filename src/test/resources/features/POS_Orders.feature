Feature: See details for Orders under Point of Sale
  As a pos manager, I should be able to see order details under Orders on Point of Sale page.

  Background:
    Given user is on the login page
    And user enter "posmanager94@info.com" and "posmanager"

  @order_details
  Scenario: check the details
    When user navigates to following page:
    |Point of Sale|
    And user navigates to "Orders" subtab
    Then user clicks on first row of the table
    And user can see the order details

