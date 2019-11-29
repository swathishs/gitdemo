Feature: SmokeSuite

@Test
Scenario: Login to website using google account

Given A browser session with the website
When the user clicks on signin button
Then login page is displayed 
When the user clicks on google
Then Google login is displayed 
When user enter email address 
And clicks on next button
Then password page is displayed
When user enter password
And clicks on next button	

Scenario: Navigation to PLP using MMY select

Given A browser session with the website
When user select the make from Make dropdown
Then the selection should be in displayed in make dropdown
When user select the model from model dropdown
Then the selection should be in displayed in model dropdown
When user select the Year from Year dropdown
Then the selection should be in displayed in Select Year dropdown
And clicks on Go button 
Then PlP is displayed

Scenario: Navigating to PDP from PLP

Given A browser session with the website
When user select instock from stock filter 
Then Instock product is dispalyed
When user click on product
Then PDP is displayed


Scenario: Adding product from PDP 
Given A browser session with the website
When user enter the quantity
And clicks on add to cart button
Then product should be added to cart and mini cart should be displayed


Scenario: Validation of Add to cart from Generic PDP

Given A browser session with the website
When user clicks on fuel management product menu
Then CLP should be displayed
When user clicks on power commander shop now
Then the Generic PDP should be displayed
When Click the Select a vehicle button
Then the pop-up should be displayed
When user select the make from Make dropdown
Then the selection should be in displayed in make dropdown
When user select the model from model dropdown
Then the selection should be in displayed in model dropdown
When user select the Year from Year dropdown
Then the selection should be in displayed in Select Year dropdown
And clicks on the Go button 
When user enter the quantity
And clicks on add to cart button
Then product should be added to cart and mini cart should be displayed
 

Scenario: Validation of Cart page

Given A browser session with the website
When user click on minicart
Then minicart is displayed
When user clicks the View Cart button
Then Cart Page should be displayed
When user update the qty
And clicks on update shopping cart
Then Qty is updated 
When user clicks on proceed to checkout button
Then checkout page is displayed





