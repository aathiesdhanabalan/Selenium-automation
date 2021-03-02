@LoginFeature @Sanity
Feature: LoginFeature

  Background:
    User navigate to Facebook
    Given I am on Facebook login page

  @Test1
    Scenario: Verify login fails with incorrect credentials
    When I enter username as "TOM"
    And I enter password as "JERRY"
    Then login should fail
    And this is a test