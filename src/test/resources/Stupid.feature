@bean
Feature: Bean

  Scenario: Set name
    Given I have a Bean
    When I set the name to "some name"
    Then the getter should return "some name" 

  Scenario: Set name 2
    Given I have a Bean
    When I set the name to "some name"
    Then the getter should return "some name" 
