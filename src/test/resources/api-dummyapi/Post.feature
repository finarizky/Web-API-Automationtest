@Post
Feature: Post

  @Get-all-data
  Scenario: User get all data
    Given The user API is available
    When User request get all data
    Then The response status should be 200
    And The data format must be match with jsonschema

  @Get-spesific-data
  Scenario: User get spesific data
    Given The user API is available
    When User request get spesific data
    Then The id should be ""
    And The response status should be 200

  @Get-wrong-id
  Scenario: User get wrong id
    Given The user API is available
    When User request get spesific wrong data
    Then User able to see error message ""
    And The response status should be 404