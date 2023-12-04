Feature: Testing rediff myPage

  Scenario: User has to test if login on rediff is successful or not
    Given I open the chrome browser
    When I enter rediff mypage URL
    Then I capture the title of the page on browser
    Then I enter username as admin and password as admin@123
    When I click on login button on the page
    Then I should see an Error message on the page
    And I click on Click here link
    And I close the chrome browser
