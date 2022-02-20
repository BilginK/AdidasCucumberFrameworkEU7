Feature: parallel two functionality

  Background:
    Given User is on the home page
    @parallel
  Scenario Outline: User checks different laptops can be added to cart <differentLaptops>
    Then User adds "<differentLaptops>" from "Laptops"

    Examples:
      |differentLaptops|
      | Sony vaio i5        |
      | Sony vaio i7        |
      | MacBook air         |
      | Dell i7 8gb         |
      | 2017 Dell 15.6 Inch |
      | MacBook Pro         |