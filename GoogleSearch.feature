Feature: feature to search shoes in AskomDch



 Scenario: Validate google search is working
    Given browser window is open
    And user is on google search page
    When click on shop now
    And user enters a text in search box
    Then user clicks on search button
    And click on first search result and add the first search result to cart
