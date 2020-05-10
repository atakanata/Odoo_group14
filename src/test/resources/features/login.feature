@login
Feature: Login
  As user, I want to be able to login with username and password

  Background:  On the login page
    Given user is on the login page

  @POS
  Scenario Outline: As a POS user, I should be able to login
    Then user enter "<username>" and "<password>"

    Examples:
      | username                    | password         |
      | posmanager94@info.com       | posmanager       |
      | posmanager95@info.com       | posmanager       |
      | posmanager96@info.com       | posmanager       |
      | posmanager97@info.com       | posmanager       |
      | posmanager98@info.com       | posmanager       |

  @contact
  Scenario Outline: As a Contact user, I should be able to login
    Then user enter "<username1>" and "<password1>"

    Examples:
      | username1      | password1        |
      | imm45@info.com | inventorymanager |
      | imm45@info.com | inventorymanager |
      | imm45@info.com | inventorymanager |
      | imm45@info.com | inventorymanager |

  @CRM
  Scenario Outline: As a CRM user, I should be able to login
    Then user enter "<username2>" and "<password2>"

    Examples:
      | username2                   | password2        |
      | eventscrmmanager50@info.com | eventscrmmanager |
      | eventscrmmanager51@info.com | eventscrmmanager |