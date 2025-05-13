@Post
Feature: Post

  @Success-post-data
  Scenario: User success post data
    Given The user API is available
    When User sends a POST request to create a user with:
      | firstName | Test    |
      | lastName  | User    |
      | email     | dynamic |
    Then The response create status should be 200
    And The email should contain the correct email

  @Post-with-special-character
  Scenario:User post with special character name
    Given The user API is available
    When User sends a POST request to create a user with:
      | firstName | Test123 |
      | lastName  | User    |
      | email     | dynamic |
    Then The response create status should be 200
    And The email should contain the correct email
    And The first name should be "Test123"

  @Post-with-same-email
  Scenario:User post with same email
    Given The user API is available
    When User sends a POST request to create a user with:
      | firstName | Test               |
      | lastName  | User               |
      | email     | nsnsbi@getnada.com |
    Then The response create status should be 400
    And The response body should contain error "BODY_NOT_VALID"
    And The response body should contain email message "Email already used"

  @Post-with-empty-firstname
  Scenario:User post with empty First Name
    Given The user API is available
    When User sends a POST request to create a user with:
      | firstName |         |
      | lastName  | User    |
      | email     | dynamic |
    Then The response create status should be 400
    And The response body should contain error "BODY_NOT_VALID"
    And The response body should contain firstname required "Path `firstName` is required."

  @Post-with-short-name
  Scenario:User post with Short Name
    Given The user API is available
    When User sends a POST request to create a user with:
      | firstName | T       |
      | lastName  | U       |
      | email     | dynamic |
    Then The response create status should be 400
    And The response body should contain error "BODY_NOT_VALID"
    And The response body should contain firstName message "Path `firstName` (`T`) is shorter than the minimum allowed length (2)."
    And The response body should contain lastName message "Path `lastName` (`U`) is shorter than the minimum allowed length (2)."
