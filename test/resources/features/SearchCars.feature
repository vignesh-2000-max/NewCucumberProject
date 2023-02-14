@Find-Your-Car
Feature: Acceptance testing to validate Find your next car page is working
        In order to validate that the Find your next car page is working fine 
        we will do the acceptance testing

  @Find-Your-Car-Positive
  Scenario: Validate Find your next car page
    Given I am navigate to "https://www.carsguide.com.au/" Cars Guide page
    Then Select brand as "BMW" from AnyMake dropdown
    And Select model as"1 Series" from Model Dropdown
    And Click Show me car buttton
