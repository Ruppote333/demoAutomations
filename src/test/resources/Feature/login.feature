@Regression
Feature: Reset functionality on login page of Application

Scenario: Validation guru99 search is working login page
    Given Open new the chrome and launch the application
    When enter username and password 
    Then user succesfully redirect home page
    

  Scenario: Validation guru99 search is working app
    Given Open new the chrome and launch the app
    When user succesfully lonch app
    Then user is navigated to search results
    
 Scenario: Validation guru99 search is working login page get text guru99 bank
    Given Open new the chrome for guru99 bank 
    When get text guru99 bank
    Then user succesfully close home page one.

 Scenario: Validation guru99 search is working reset password
    Given Open new the chrome and launch the application for reset password
    When user succesfully lonch web app
    Then user successfully land on reset password page
    
    
    Scenario: Validation guru99 search is working login page get text guru99
    Given Open home new the chrome and launch the application
    When get text 
    Then user succesfully close home page