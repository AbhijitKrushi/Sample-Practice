Feature: TC001 Orange HRM Apllication - automating skills functionality

Background: Common steps
Given user lanch browser and maximize the page
When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC001 Add Skills record - I am creating skills record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to skills page
        Then Add skills with skillname as "Java999" and skilldescription as "Java999 descr"
        When User click logout 
        Then close the Browser