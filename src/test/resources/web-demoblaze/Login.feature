@login
Feature: Login

  @success-login
  Scenario: User success login
    Given User is on landing page
    When User click header menu login
    And User input username with "nanabi"
    And User input password with "123"
    And User click button login
    Then User is on homepage

  @login-wrong-password
  Scenario: User login with wrong password
    Given User is on landing page
    When User click header menu login
    And User input username with "nanabi"
    And User input password with "xxx"
    And User click button login
    Then User able to see warning popup "Wrong password."

  @login-unregistered-account
  Scenario: User login with unregistered account
    Given User is on landing page
    When User click header menu login
    And User input username with "pbb"
    And User input password with "12345"
    And User click button login
    Then User able to see popup "User does not exist"

  @cancel-login
  Scenario: User cancel login
    Given User is on landing page
    When User click header menu login
    And User click button close
    Then User back to landing page
