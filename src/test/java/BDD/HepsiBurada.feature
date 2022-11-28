Feature: UI Scenarios
  Background: Navigate and Login to Website
    Given navigate to website
    And accept cookies
    And user log in
    And confirm user is logged in

@ui
  Scenario: tests to add product from different stores without login
    And type "laptop"
    And search product
    And choose a product
    And add product to cart
    And choose third product
    And add product to cart
    And navigate to cart page
    And increase product count
    And return to homepage
    Then logout
    Then close all tabs

@ui
  Scenario: tests to add product from different stores with login
    And go to profile page
    And change birthday to "08081990"
    And return to homepage
    Then logout
    Then close all tabs



