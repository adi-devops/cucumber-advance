Feature: Verify Search functionality

  Scenario: search given text and verify result first title
    Given I start a new browser
    When  I am on google search page
    Then I should see title Google
    