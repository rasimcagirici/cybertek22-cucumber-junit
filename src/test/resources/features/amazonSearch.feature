Feature: Amazon Search and Cart feature

  Scenario: Amazon search and cart functionality
    When User is on the Amazon Home Page
    And User search for hats for men
    And User Add the first hat appearing to Cart with quantity 2
    Then the total price and quantity should be correct
    When User Reduce the quantity from 2 to 1 in Cart for the item selected
    Then total price and quantity has been correctly changed