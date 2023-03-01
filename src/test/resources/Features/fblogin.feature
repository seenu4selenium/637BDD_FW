@tag
Feature: FB login feature

  @tag1
  Scenario: Login to FB application with invalid data scenario
    Given Open Chrome with FB URL
    And USer type invald UN and PWSD
    When User clicks on Login button
    Then Application should display validation Message

  @tag2
  Scenario: Login to FB application with valid data scenario
    Given Open Chrome with FB URL
    And USer type vald UN and PWSD
    When User clicks on Login button
    Then Application should display validation Message

  @tag3
  Scenario Outline: FB login with invalid credentials
    Given Open Chrome with FB URL
    And User enter invalid "<username>" and "<password>"
    When User clicks on Login button

    Examples: 
      | username        | password |
      | rahul@gmail.com | Test@123 |
      | xyz@gmail.com   | Testtest |
      | sreenivas@gmail.com   | TEst@123456 |
