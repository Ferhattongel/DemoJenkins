Feature: google title verification
  @smoke
  Scenario: verify title
    Given user on the google page
    When  user search "apple"
    Then user should be able to see title starts with "apple"