package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/*To execute feature file using JUnit*/
/*
@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features/MyHoliday.feature",  
	glue = "stepDefinitions",
			plugin = { "pretty",
						"html:target/cucumber-reports"})
//Cucumber HTML Reports


/*
@CucumberOptions(
		features = "src/test/java/features/MyHoliday.feature",  
		glue = "stepDefinitions",
				plugin = { "pretty",
							"json:target/cucumber-reports"})
//Cucumber JSON Report
*/

/*
@CucumberOptions(
		features = "src/test/java/features/MyHoliday.feature",  
		glue = "stepDefinitions",
				plugin = { "pretty",
							"junit:target/cucumber-reports"})
//Cucumber JUNIT XML Report
*/


//dataDrivenStepDefinition
/*To execute feature file using JUnit*/
/*@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features/Datadriven.feature", tags="@BookFlight", 
	glue = "stepDefinitions",
	plugin = { "pretty",
				"html:target/cucumber-reports"}) 
*/

//DataTable
@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features/Login.feature", tags="@ValidCredentials", 
	glue = "stepDefinitions",
	plugin = { "pretty",
				"html:target/cucumber-reports"}) 
public class TestRunner {
	
	
}
