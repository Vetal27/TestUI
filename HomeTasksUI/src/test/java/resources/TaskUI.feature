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
    When User click on 'List Box' item from the 'Menu List'
    And User select 'Bootstrap List Box'
    And User check that search input field placeholder equals to 'search'
    And User type '<Search Word>' text into search input field
    Then User check the all search suggestions contains '<Search Word>' value
    Examples:
      | Home Page                          | Search Word |
      | https://www.seleniumeasy.com/test/ | is          |