Feature: Test Registration

Description : User Story  

Scenario: Test Registration with valid data

Given user open application newtours.demoaut.com
When User clicks on registration
Then User validates registration page
When User enter firstname 
And User enter lastname 
And User enter password
And User enter confirm password
And user click on Register button
Then User validates Registration success