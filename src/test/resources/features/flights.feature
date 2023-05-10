Feature: Testing the different flight types
  Scenario: Test one-way flight
    Given Flight selection homepage
    When User clicks on one way button
    And User selects departure "Frankfurt"
    And Departure date 5-th day on 0-th month from this month
    And User selects destination "Bayern"
    And User selects 2 adults
    And User selects cabin preference 1
    And User starts searching for flights by clicking submit button
    And User selects flight 1-st on the list
    And User selects compartment 0
    And User fills in passenger data for one way
    And User selects seat with code "22A"
    And User clicks on confirm button
    Then Confirm booking number is displayed and get booking number

  Scenario:
    Given Flight selection homepage
    When User clicks on round-trip button
    And User selects departure "Frankfurt"
    And Departure date 6 days from today
    And User selects destination "Budapest"
    And Return date 1-th day on 1-th month from this month
    And User selects 2 adults
    And User selects 1 infants
    And User selects cabin preference 2
    And User starts searching for flights by clicking submit button
    And User selects flight 1-st on the list
    And User selects compartment 0
    And User selects credit card payment option
    And User clicks on add car button
    And User fills in pickup hour "08:00 am" and drop-off hour "08:00 am"
    And User clicks on submit search button in car page
    And User selects 1-st card on the list
    And User fills in passenger data round trip
    And User fills in credit card data
    And User clicks on confirm button
    Then Confirm booking number is displayed and get booking number
    And Check names in passenger list match the filled in names

  Scenario:
    Given Flight selection homepage
    When User clicks on multi destination button
    And User selects first departure city "Tirana" and first destination "Vienna"
    And User selects first flight 5 day and 0 months from this month
    And User clicks on add a second flight
    And User selects second departure city "Vienna" and second destination city "Bangkok"
    And User selects second flight 0 days, 0 months after first flight
    And User clicks on add a third flight
    And User selects third flight departure city "Bangkok" and third destination city "Vienna"
    And User selects third flight 7 days, 0 months after second flight
    And User selects cabin preference 1
    And User selects 3 adults
    And User selects 2 children
    And User click on advanced options
    And User selects flight type "1"
    And User selects preferred airline "Austrian"
    And User start searching for flights
    And User selects flight with preferred airline "Austrian"
    And User selects compartment 0 for multi destination flights
    And User selects credit card payment option
    And User clicks on add hotel button
    And User selects hotel location "Bangkok" and checkout date 7 days from arrival
    And User selects number of rooms 2
    And For selected room1 select 2 adults and 0 children, Room2 1 adults and 2 children
    And Change select of children in Room2  8 and 5
    And User clicks on search for hotel button
    And User selects hotels with max price 3500.00-$ per night
    And User selects hotel full package with max price 25000.00 -$ total
    And User fills in passenger data for multi flight
    And User fills in credit card data
    And User clicks on confirm button
    Then Confirm booking number is displayed and get booking number
    And Check names in passenger list match the filled in names

