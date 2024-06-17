@Regression
Feature: Login with valid credentials

  As customer I want to be able to login into the app providing valid credentials.

  @Login
    @Start
  Scenario Outline: Login to app
    Given the app login page is open
    When the user enters correct <Adresa de E-mail> and <parola>
    Then the user is logged in

    Examples:
      | Adresa de E-mail         |   parola  |
      | anyalukyanova1@gmail.com | Anna1234  |