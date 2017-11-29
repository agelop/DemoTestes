# Este é o feature file
Feature: Register new users

  Scenario: New user enters Register
    Given The user is on the "home" page
    When I click on register link
    Then The register new  user page is displayed

  Scenario Outline: Register new user to the page
    Given The user is on the "register" page
    When I enter the <fullname>
    And I enter the <email>
    And I enter the <username>
    And I enter the <password>
    And I click "register" button
    Then New user created message is displayed

    Examples: 
      | fullname      | email            | username | password |
      | Homer Simpson | homer@server.com | homer    | pwd1     |
