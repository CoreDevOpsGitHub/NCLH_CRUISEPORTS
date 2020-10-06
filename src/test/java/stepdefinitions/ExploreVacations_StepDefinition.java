package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static user_interface.HomePage.URL;


public class ExploreVacations_StepDefinition {

    @Before
    public void prepareScenario() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^a client searches for '(.*)'$")
    public void aClientSearchesForHawaiiCruises(String destination_from_feature) {

        // This section opens the original website (https://www.ncl.com/)
        theActorCalled("The User").wasAbleTo(OpenSite_Task.to(URL));

        // This section select the "Destination" drop down arrow and then selects the destination checkbox
        theActorInTheSpotlight().attemptsTo(SelectDestination_ExploreVacations_Task.choosedestination(destination_from_feature));

        }



    @Given("^filters result by price range")
    public void filtersResultByPriceRangeFrom() {
        theActorInTheSpotlight().attemptsTo(FilterPrice_ExploreVacations_Task.goesTo());
    }

    @When("^the filter gets applied$")
    public void theFilterGetsApplied() {
        // Write code here that turns the phrathrow new PendingException();
    }

    @Then("^the price of displayed cruises should be within the range$")
    public void thePriceOfDisplayedCruisesShouldBeWithinTheRange() {
        // Write code here that turns the phra//  throw new PendingException();
    }


}
