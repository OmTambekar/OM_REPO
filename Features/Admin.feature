Feature:Admin

@smoke
Scenario: Login with valid Credentials
Given User launch Chrome Browser
When User open url "https://admin-demo.nopcommerce.com/login"
When User enter Email as "admin@yourstore.com" and Password as "admin"
When User click on Login button
Then User verify page title should be "Dashboard / nopCommerce administration"
And Logout option should click
Then close browser

@sanity
Scenario Outline: Login with Data Driven
Given User launch Chrome Browser
When User open url "https://admin-demo.nopcommerce.com/login"
When User enter Email as "<email>" and Password as "<password>"
When User click on Login button
Then User verify page title should be "Dashboard / nopCommerce administration"
And Logout option should click
Then close browser
Examples:
| email 									|password		|
|admin@yourstore.com			|admin			|
|admin123@yourstore.com		|admin			|
|admin@yourstore.com			|admin123		|
