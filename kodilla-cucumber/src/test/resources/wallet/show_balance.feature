Feature: Display balance
  Scenario: User checks the balance of their wallet
    Given I have $100 in my wallet
    When I check the balance of my wallet
    Then The balance of my wallet is $100