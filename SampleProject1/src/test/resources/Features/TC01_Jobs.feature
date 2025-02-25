Feature: TC01 Orange HRM Apllication - automating Jobs functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario: TC001 Add Jobs record - I am creating jobs record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to Jobs page
        Then Add Jobtitle as "Sales77" jobdescr as "Sales77" JobNote as "Sales77 Note"
        When User click logout 
        Then close the Browser 