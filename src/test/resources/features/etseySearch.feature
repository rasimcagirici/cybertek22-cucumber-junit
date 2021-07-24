Feature: Etsy Search Functionality Title Verification



  Scenario: Etsy default title verification
    Given User is on the Etsy landing page
    Then User should see Etsy title as expected


  Scenario: User search title verification
    Given User is on the Etsy landing page
    When User types "Wooden spoon" in the search bar
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title
