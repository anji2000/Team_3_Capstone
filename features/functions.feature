
  @functiontesting
  Feature: sample app validation
  Scenario: sample app login
    Given open sample app
    And  enter user name and password
    And  click on login
    Then check response
    

 