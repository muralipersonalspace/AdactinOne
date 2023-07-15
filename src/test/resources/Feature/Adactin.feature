Feature:Verify Adactin LoginPage
@Smoketest
Scenario Outline: Verify login with valid credentials
Given  user is on adactin application
When   user enters valid"<username>" and "<password>"
And    user clicks login button
Then   user verfies login success message "Hello muralipr!"

Examples:
|username||password|
|muralipr||G96C3E|
@RegressionTest
Scenario Outline: verify login with invalid credentials
Given   user is on adactin application
When    user enters invalid "<username>" and "<password>"
And     user clicks login button
Then    user verifies error messege "invalid login details or your password might have expired"

Examples:
|username|password|
|muralipr|G87C3E|
@Smoketest
Scenario: verify login page using enter key with valid credentials
Given    user is on adactin application
When     user enters username and password and press enter key
        |username|password|
        |muralipr|G96C3E|
Then    user verifies login success message "Hello muralipr!"







