Feature: Home and Add to cart Feature

  @Regression
  Scenario: User logs in successfully with valid credentials
    Given I am on the login page
    When I enter valid credentials
    Then I add the single product into the cart from Home page
    And I check the button name changed to Remove
    And I click on shopping cart on Home page
    And I navigated to cart page and click checkout
    And I entered the values in first name,last name and zip code
      | firstName | lastName | zipCode |
      | test      | test     | 600000  |
    And I clicked on Continue button in checkout info page
    And I navigated to overview page and validate the products and price
    And I clicked on Finish button
    And I navigated to see the "Thank you for your order!" message in Complete page