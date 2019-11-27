package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locator.google;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class googlesteps {
    public static WebDriver driver;

    @Given("I navigate to google search page")
    public void i_navigate_to_google_search_page() {
    	driver = new support.driver().getDriver();
    	driver.get("http://www.google.com/");
 		System.out.format("Thread ID - %2d - feature file.\n", Thread.currentThread().getId());
    }

    @When("I type the term in google search bar and click on serach results")
    public void i_type_the_term_in_google_search_bar_and_click_on_serach_results() {
    	PageFactory.initElements(driver,google.class);
    	model.googlesearch.search_for(driver, "test");
    }

    @Then("I should get the results page")
    public void i_should_get_the_results_page() {
    	assertEquals(model.googlesearch.after_search_displayed(driver), true);
//      assertEquals("asdf","efe");
    	driver.quit();
    }
}