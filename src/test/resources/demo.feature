# Este é o primeiro feature file

Feature: Register new users

  Scenario: New user enters Register
    Given The user is on the "home" page
    When I click on register link
    Then The register new  user page is displayed
