Feature: homeTaskUI




  Scenario Outline: Task 1
    Given User opens '<Home Page>' page
    When User select 'Basic' tab
    And User select 'Simple Form Demo'
    And User check that 'Enter message' input field placeholder equals to '<Placeholder text>'
    And User type '<Text>' into 'Single Input Field'
    And User click 'Show Message' button
    Then User Check 'Your Message' text equals to entered earlier '<Text>'
    Examples:
      | Home Page                          | Placeholder text          | Text                 |
      | https://www.seleniumeasy.com/test/ | Please enter your Message | My first message     |

  Scenario Outline: Task 2
    Given User opens '<Home Page>' page
    When User Click on 'List Box' item from the 'Menu List'
    And User Select 'Bootstrap List Box'
    Then Check that search input field placeholder equals to 'search'
    And Type "is" text into search input field
    Then Check the all search suggestions contains "is" value
    Examples:
      | Home Page                          |
      | https://www.seleniumeasy.com/test/ |