package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

System.out.println("This is from Gitstuffs");

public class stepDefination {
      
	@Given("^I live in Dublin with 2 adults and 2 kids$")
    public void needFlight() {
             System.out.println("I live in Dublin with 2 adults and 2 kids");
    }

    @Given("^I need 1 room with 2 double beds$")
    public void needRoom() {
             System.out.println("I need 1 room with 2 double beds");
    }

    @When("^I search online$")
    public void onlineSearch() {
             System.out.println("I search online");
    }

    @Then("^TripAdvisor should provide me options of flights on 22nd Jan 2020$")
    public void searchFlightInTripAdvisor() {
             System.out.println("TripAdvisor should provide me options of flights on 22nd Jan 2020");
    }

   @Then("^Cost of my flight should not be more than 50 Euro per person$")
    public void flightFare() {
             System.out.println("Cost of my flight should not be more than 50 Euro per person");
    }

    @Then("^TripAdvisor should provide me options of hotels for time period of 22nd Jan 2020 to 25th Jan 2020")
    public void searchRoomInTripAdvisor() {
             System.out.println(
                                "TripAdvisor should provide me options of hotels for time period of 22nd Jan 2020 to 25th Jan 2020");
    }

    @And("^I want to book one way flight ticket from Dublin to London on 22nd Jan 2020$")
    public void ticketType() {
             System.out.println("I want to book one way flight ticket from Dublin to London on 22nd Jan 2020");
    }

    @And("^I want to book hotel from 22nd Jan 2020 to 25th Jan 2020$")
    public void stayDuration() {
             System.out.println("I want to book hotel from 22nd Jan 2020 to 25th Jan 2020");
    }

    @And("^Fare of my room should not be more than 200 Euro per night$")
    public void roomFare() {
             System.out.println("Fare of my room should not be more than 200 Euro per night");
    }

    @And("^Breakfast should be included in the room fare$")
    public void includeBreakfast() {
             System.out.println("Breakfast should be included in the room fare");
    }

    @And("^Tickets should be refundable$")
    public void refunableTicket() {
             System.out.println("Tickets should be refundable");
    }
	      
}
