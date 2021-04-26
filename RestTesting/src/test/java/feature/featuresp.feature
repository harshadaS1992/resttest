Feature: create transaction 

Scenario: AE to PH cashpickup transaction 
Given baseurl token and jsonbody
When post transaction invoice AE to PH
Then transaction should be created successfully
