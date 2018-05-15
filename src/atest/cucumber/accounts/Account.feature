#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## This sample is from the toolsqa.com tutorial at toolsqa.com/cucumber/cucumber-jvm-feature-file/
# To use this you need to map the 'natural' language to Selenium commands and java. 
# Seems like a lot of effort. 

#Sample Feature Definition Template
@tag
Feature: Test account page
	I want to use this template for my feature file

@tag1
Scenario: Navigate to the demo page
When Enter the demo page url
Then The demo page is displayed

@tag2
Scenario Outline: I want to view accounts by owner
Given I am on the demo page
When Click on the accounts by owner link for Keri
Then Message displayed account 123456789

