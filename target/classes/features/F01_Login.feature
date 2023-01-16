@smoke
Feature: F01_Login | Verify the login section

  Scenario: User enters valid user id and password
  Given user go to demo page
  And user enters valid userid
    And user enters valid pass
    Then users clicks login
    Then login successfully
    Then take a screen shot

  Scenario: User enters invalid user id and password
    Given user go to demo page
    And user enters invalid userid
    And user enters valid pass
    Then users clicks login
    Then UnSuccess login

  Scenario: User enters valid user id and invalid password
    Given user go to demo page
    And user enters valid userid
    And user enters invalid pass
    Then users clicks login
    Then UnSuccess login

  Scenario: User enters invalid user id and invalid password
    Given user go to demo page
    And user enters invalid userid
    And user enters invalid pass
    Then users clicks login
    Then UnSuccess login