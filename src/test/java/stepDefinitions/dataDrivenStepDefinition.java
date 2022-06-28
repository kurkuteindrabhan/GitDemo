package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataDrivenStepDefinition {
	
	@Given("^I live in Geneva with (.+) adults and (.+) kids$")
    public void i_live_in_geneva_with_adults_and_kids(int noofadults, int noofkids) throws Throwable {
		System.out.println("I live in Dublin with " + noofadults+ " adults and " + noofkids+ " kids");
    }

    @And("^I want to book one way flight ticket from Geneva to London on (.+)$")
    public void i_want_to_book_one_way_flight_ticket_from_geneva_to_london_on(String traveldate) throws Throwable {
    	System.out.println("I want to book one way flight ticket from Geneva to London on "+ traveldate);
    }

    @When("^I search onlinee$")
    public void i_search_onlinee() throws Throwable {
    	System.out.println("I search onlinee");
    }

    @Then("^TripAdvisor should provide me options of flights on (.+)$")
    public void tripadvisor_should_provide_me_options_of_flights_on(String traveldate) throws Throwable {
    	System.out.println("TripAdvisor should provide me options of flights on " + traveldate);
    }

    @And("^Cost of my flight should not be more than (.+) Euroo per person$")
    public void cost_of_my_flight_should_not_be_more_than_euroo_per_person(int flightfare) throws Throwable {
    	System.out.println("Cost of my flight should not be more than " + flightfare+ " Euroo per person");
    }

    @And("^Tickets should be refundablee$")
    public void tickets_should_be_refundablee() throws Throwable {
    	System.out.println("Tickets should be refundablee");
    } 
    
/*	@Given("I live in Geneva with {int} adults and {int} kids")
    public void i_live_in_Geneva_with_adults_and_kids(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("I live in Geneva with " + int1 + " adults and " + int2 + " kids");
    }
    
    @Given("I want to book one way flight ticket from Geneva to London on {int}-Jan-{int}")
    public void i_want_to_book_one_way_flight_ticket_from_Geneva_to_london_on_jan(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("I want to book one way flight ticket from Geneva to London on "+ int1 + int2);
    }
    @When("I search onlinee")
    public void i_search_onlinee() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("I search onlinee");
    }
    @Then("TripAdvisor should provide me options of flights on {int}-Jan-{int}")
    public void trip_advisor_should_provide_me_options_of_flights_on_jan(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("TripAdvisor should provide me options of flights on " + int1 + int2);
    }
    @Then("Cost of my flight should not be more than {int} Euro per person")
    public void cost_of_my_flight_should_not_be_more_than_euro_per_person(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Cost of my flight should not be more than " + int1+ " Euro per person");
    }
    @Then("Tickets should be refundablee")
    public void tickets_should_be_refundablee() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Tickets should be refundable");
    } */
}
