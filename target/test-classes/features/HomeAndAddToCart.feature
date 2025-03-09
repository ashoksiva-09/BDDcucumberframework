Feature: Home and Add to cart Feature

  @Test
  Scenario: User logs in successfully with valid credentials
    Given I am on the login page
    When I enter valid credentials
    Then I add the single product into the cart from Home page
    And I check the button name changed to Remove