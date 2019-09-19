@regression
Feature: AddTariffPlan

  @regression @smoke @Third
  Scenario: 
    Given User should be in the telecom home page
    And click add customer button
    When User enter all the data value.
      | 2500 | 100 | 50 | 40 | 3 | 2 | 3 |
      |  500 |  50 | 10 |  4 | 2 | 1 | 4 |
      |  600 |  70 | 70 | 10 | 1 | 3 | 1 |
      |  550 |  10 | 20 | 20 | 4 | 6 | 2 |
      |  300 |  30 | 10 | 50 | 5 | 1 | 1 |
    And click on submit button
    Then user should be displayed customer id is entered

  @smoke @Second
  Scenario: 
    Given User should be in the telecom home page
    And click add customer button
    When User enter all the data values.
      | MothRen | LO  | IM | SMS | LC | IC | SC |
      |    2500 | 100 | 50 |  40 |  3 |  2 |  3 |
      |     500 |  50 | 10 |   4 |  2 |  1 |  4 |
      |     600 |  70 | 70 |  10 |  1 |  3 |  1 |
      |     550 |  10 | 20 |  20 |  4 |  6 |  2 |
      |     300 |  30 | 10 |  50 |  5 |  1 |  1 |
    And click on submit button
    Then user should be displayed customer id is entered

  @regression @First
  Scenario Outline: 
    Given User should be in the telecom home page
    And click add customer button
    When User enter all the data value of outline "<MothRen>","<LO>","<IM>","<SMS>","<LC>","<IC>","<SC>"
    And click on submit button
    Then user should be displayed customer id is entered

    Examples: 
      | MothRen | LO  | IM | SMS | LC | IC | SC |
      |    2500 | 100 | 50 |  40 |  3 |  2 |  3 |
      |     500 |  50 | 10 |   4 |  2 |  1 |  4 |
      |     600 |  70 | 70 |  10 |  1 |  3 |  1 |
      |     300 |  30 | 10 |  50 |  5 |  1 |  1 |
