Feature: Prevent users from taking out more money than their wallet contains
  Scenario: User tries to take out more money than their balance
    Given There should be $100 in my wallet
    When I want to withdraw $200
    Then It can't be dispensed
    And I should be told that I don't have enough money in my wallet