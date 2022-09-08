Feature: Register

@RegisterSuccessFul
  Scenario: register user
    Given the user needs to register
    When the user register data
    |username|email|password|
    |46380443|mendozabrayan1502@gmail.com|Hijohermoso123_09|
    Then  register successful
@RegisterError
Scenario: register user
  Given the user needs to register
  When the user register data
    |username|email|password|
    |1002    |roneasda@gamil|123|
  Then  register error
