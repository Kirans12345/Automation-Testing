Feature: Test wikipage on browser

  Scenario: Test create account on wiki page
    Given user is on wiki page
    Then user enters username
    And User enters password

  Scenario: Test Login link on wikipage
    Given User is on main page
    When user clicks on login link
    Then user clicks on checkbox on login page
    Then User clicks on forgot password
