Feature: Login
  @LoginCorrecto
  Scenario: Login user
    Given the user needs to login
    When the user enter data
      |username|password|
      |10027272152|Maysitapro123|
    Then  login successful
  @loginIncorrecto
  Scenario: Login user
    Given the user needs to register
    When the user enter data
      |username|password|
      |100271351351|Maysitaasdasd|
    Then  he user no login