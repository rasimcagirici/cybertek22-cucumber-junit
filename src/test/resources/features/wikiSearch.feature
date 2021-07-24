Feature: Wikipedia Search Functionality

  Background:
    Given User is on Wikipedia home page


  Scenario: Wikipedia Search Functionality Title
    When User types "Steve Jobs" in the wiki search bar
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the wiki title


  Scenario: Wikiepdia Search Functionality Header Verification
    When User types "Steve Jobs" in the wiki search bar
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the main header


  Scenario: Wikipedia Search Functionality Image Header Verification
    When User types "Steve Jobs" in the wiki search bar
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the image header


  Scenario Outline: Wikiepdia Search Functionality Header Verification
    When User types "<searchValue>" in the wiki search bar
    And User clicks wiki search button
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedTitle>" in the wiki title

    Examples: search terms we are going to use in this template is a below
      | searchValue       | expectedMainHeader | expectedTitle     |
      | Steve Jobs        | Steve Jobs         | Steve Jobs        |
      | Cristiano Ronaldo | Cristiano Ronaldo  | Cristiano Ronaldo |
      | Fenerbahçe S.K.   | Fenerbahçe S.K.    | Fenerbahçe S.K.   |
      | Muhammed Ali      | Muhammad Ali       | Muhammad Ali      |