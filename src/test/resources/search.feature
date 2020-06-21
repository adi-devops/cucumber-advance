Feature: Verify Search functionality

  Scenario Outline: search given text and verify result first title
    Given I start a new browser
    And  I am on google search page
    When I do a search for "<keyword>"
    And I click the search button
    And the first tile should be "<title>"

    Examples: 
      | keyword           | title                                 |
      | abc automate      | ABC Automate - ABC Automate - YouTube |
      | github adi-devops | adi-devops (Aditya) · GitHub          |
