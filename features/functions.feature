
  @functiontesting
  Feature: sample app validation
  Scenario: sample app login
    Given open sample app
    And  enter user name and password
    And  click on login
    Then check response 
    And  enter user name and password try one
    And  click on login one
    Then check response of one
    And  enter user name and password try two
    And  click on login two
    Then check response two
   
    

 