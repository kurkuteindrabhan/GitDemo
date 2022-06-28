package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Before  //global tags
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver",
                "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Given("^User is on HRMLogin page$")
    public void user_is_on_hrmlogin_page() throws Throwable {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("^User enters valid credentials$")
    public void user_enters_valid_credentials(DataTable dataTable) throws Throwable {
        System.out.println("Credentials entered");
        
        List<String> signUpForm= dataTable.asList();
        
        String userName = signUpForm.get(0);
        String passWord = signUpForm.get(1);
        
        driver.findElement(By.name("txtUsername")).sendKeys(userName);
        driver.findElement(By.name("txtPassword")).sendKeys(passWord);
        driver.findElement(By.id("btnLogin")).submit();  
    }

    @Then("^User should be able to login sucessfully and new page open$")
    public void user_should_be_able_to_login_sucessfully_and_new_page_open() throws Throwable {
    	System.out.println("Credentials entered");
    }
    
    @After
    public void teardown(){
           driver.close();
    }
}
