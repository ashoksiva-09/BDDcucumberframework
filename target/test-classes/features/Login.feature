Feature: Login functionality

  @Test
  Scenario Outline: User logs in with multiple users
    Given I am on the login page
    When I enter "<username>" and "<password>"
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

  @Test
  Scenario: User logs in with multiple users using excel data
    Given I am on the login page
    When I enter credentials using excel data

  @Test
  Scenario: User logs in successfully with valid credentials
    Given I am on the login page
    When I enter valid credentials
    Then I should be redirected to the homepage and check Logo text