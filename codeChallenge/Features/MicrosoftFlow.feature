@microsoft
Feature: Microsoft flow page
    Scenario: Happy Path
    	Given I open Chrome
        Given I launch "https://www.microsoft.com/en-us/"
        Then User validate all menu items are present
        When User go to Windows
        And  User click on Windows 10 Menu and print values
        When User go to Search next to the shopping cart
        Then User search for "Visual Studio"
        And Click on the first one to go to the details page and Validate prices
        When Click Add To Cart
        Then Verify all 3 price amounts are the same
        Then Select 20 items
        Then Validate new amount of price
		Then Close browser
        