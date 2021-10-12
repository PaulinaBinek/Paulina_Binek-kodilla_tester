Feature: Money withdrawal


  Scenario: I can withdraw $50

Given I have deposited $200 in my wallet
When I request $50
Then $50 should be dispensed
  And The balance should be $150

    Scenario: I can withdraw entire balance
      Given I have deposited $1000 in my wallet
      When I request $1000
      Then $1000 should be dispensed
    And The balance should be $0
