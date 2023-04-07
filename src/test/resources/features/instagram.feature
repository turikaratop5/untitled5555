Feature: User should able to watch all of followers story of desired users.

  Scenario: User should watch the all the stories.
    Given user is on the instagram page
    And user should logged in instagram
    Then user go to profile
    Then I click on the coordinates at x: 100 and y: 200
    And user should watch all the stories

