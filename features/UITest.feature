@UITesting
Feature: homepage validation
	Scenario: website title validation
	Given open chrome browser and enter URL
	When opens website
	Then validate title
	
	
	Scenario: title validation of Dynamic ID
	Given click on dynamic id
	When opens page
	Then validate page title
 
 Scenario: title validation of ClassAttribute
	Given click on ClassAttribute
	When opens page ClassAttribute
	Then validate page title of ClassAttribute and button
 
 
 Scenario: title validation of HiddenLayer
	Given click on HiddenLayer
	When opens page HiddenLayer
	Then validate page title of HiddenLayer and button testing
 
 
 Scenario: testing LoadDelay
	Given click on LoadDelay
	When opens page LoadDelay
	Then test the button after delay
 

 