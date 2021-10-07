Feature: Divisible Numbers
  Checking if the numbers are divisible

  Scenario Outline: Numbers can be divided by given numbers
    Given Number is <number>
    When I check whether it can be divided by given numbers
    Then It should be <reply>
    Examples:
      | number | reply |
      |   9    | "Fizz" |
      |   20   | "Buzz" |
      |   15   | "FizzBuzz"|
      |   11   | "None"   |