
Feature: Test Orange HRM Application

@login 
  Scenario: Test Login Functionality
    Given user is on login page
    When user enter valid username and password
    Then user will be on homepage
@homepage
  Scenario: Validating homepage
    Then check the logo
    And check the url and Title of homepage
@pimpage
  Scenario Outline: validate pimpage with multiple employees
    Given user is on pimpage and check url
    Then click on add button to add employee with "<firstname>" and "<lastname>" save the details
    Then user should be able to search the emplyoee which is added
    And should be able to delete the employee

    Examples: 
      | firstname | lastname |
      | Madhavi   | Akkina   |
      | Pallavi   | Jadhav   |
      | Binsy     | Susan    |
      | Swapnil   | Paddawad |
