@Login
Feature: Salesforce login

  @Sanity
  Scenario Outline: Sanity_Verify login to Salesforce
    Given login to salesforce with <username> and <password>
    Then home page should display
    
    Examples:
    |username|password|
    |ajayalugolu2529-pkb1@force.com|PassWord@SF1|
    |aa2529@gmail.com|PassWord@SF1|