@CreateAccount
Feature: Create Account in Salesforce

  Scenario Outline: Sanity_Create Account in Salesforce
    Given login to salesforce with <username> and <password>
    And navigate to accounts module
    When user enter all mandatory fields in account and save it
    Then account must get created
    
    Examples: 
      |username|password|
      |ajayalugolu2529-pkb1@force.com|PassWord@SF1|