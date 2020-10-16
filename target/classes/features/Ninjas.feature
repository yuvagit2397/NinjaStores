Feature: Shopping demo of ninja stores
Scenario: searching laptop
Given user clicks laptop link
When set the price order
Then add high price lap in cart

Scenario: searching mp3 players
Given user opens mp3 list
When getting list with price
Then add "iPod Touch" to the cart


