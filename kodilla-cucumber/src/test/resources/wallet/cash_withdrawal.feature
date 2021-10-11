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

      Scenario: I can't withdraw more than I have in the wallet
        Given There is $100 in my wallet
        When I want to withdraw $200
        Then It can't be dispensed
      And I should be told that I don't have enough money in my wallet

        Scenario: I don't want to withdraw
          Given I have deposited $100 in my wallet
          When I don't want any withdrawal
          Then $0 should be dispensed
        And The balance should be $100
