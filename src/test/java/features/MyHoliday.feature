Feature: Book Flight and Hotel for Vacation
 
@BookOneWayFlight
Scenario: Book Flight for one way trip
 
  Given I live in Dublin with 2 adults and 2 kids
  And I want to book one way flight ticket from Dublin to London on 22nd Jan 2020
  When I search online
  Then TripAdvisor should provide me options of flights on 22nd Jan 2020
  And Cost of my flight should not be more than 50 Euro per person
  And Tickets should be refundable
  
@BookHotel
Scenario: Book Hotel for one the trip
 
  Given I need 1 room with 2 double beds
  And I want to book hotel from 22nd Jan 2020 to 25th Jan 2020
  When I search online
  Then TripAdvisor should provide me options of hotels for time period of 22nd Jan 2020 to 25th Jan 2020
  And Fare of my room should not be more than 200 Euro per night
  And Breakfast should be included in the room fare