Feature: user able to purchase the product and verify the order confirmation
Description "optional"

Scenario: user able to select the product, add to cart, add shipping information, place order, & verify the order confirmation number
Given user able to login the application
When user able to select Jackets from Men module
And user able to select a Jacket product's size, color, quantity
And user able to click add to cart button
And  user able to click on the shopping cart pop-up
And  user able to click on the proceed to checkout
And  user able to add shipping information
And  user able to select shipping method radial button and click on next button
And  user able to click on the place order button
Then user able to verify the confirmation message "Thank you for your purchase!"