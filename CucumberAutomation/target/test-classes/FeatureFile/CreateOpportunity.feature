
@CreateOpportunity
Feature: Create Opportunity in Salesforce
 
  Scenario Outline: Sanity_Create opportunity in Salesforce
    Given login to salesforce with <username> and <password>
    And navigate to opportunities module
    When user enter all mandatory fields in opportunity and save it
    Then opportunity must get created

    Examples: 
      |username|password|
      |ajayalugolu2529-pkb1@force.com|PassWord@SF1|
