Feature: TC01 Orange HRM Apllication - automating Nationality functionality
	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: I am creating skills record
    Then Log in to Website with below credentials.
     
     |Admin|admin123|
    Then Create Nationality records
    
    |ABHI999|
    |ABHI777|
    |ABHI666|
    When Click on logout button
    Then Close Browser
  