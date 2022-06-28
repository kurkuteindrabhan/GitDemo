Feature: Booking flight
@BookFlight
Scenario Outline: Book Flight for one-way trip
 
Given I live in Geneva with <noOfAdults> adults and <noOfKids> kids
And I want to book one way flight ticket from Geneva to London on <travelDate>
When I search onlinee
Then TripAdvisor should provide me options of flights on <travelDate>
And Cost of my flight should not be more than <flightFare> Euroo per person
And Tickets should be refundablee
   
 Examples:
  |noOfAdults         |noOfKids         |travelDate    |flightFare    |
  |2                  |  2              |22-Jan-2020   |100           |
  |1                  |  0              |12-Mar-2020   |50            |