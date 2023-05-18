package au.com.carsguide.steps;

import au.com.carsguide.browserfactory.pages.HomePage;
import au.com.carsguide.browserfactory.pages.NewUsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuySteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\"tab$")
    public void iMouseHoverOnTab(String arg0)  {
     new HomePage().mouseHoverOnBuySell();
    }


    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {

        new HomePage().mouseHoverAndClickOnSearchCars();
    }


    @Then("^I navigate to 'new and used car search'page$")
    public void iNavigateToNewAndUsedCarSearchPage() {

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
       new NewUsedCarPage().selectCarMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new NewUsedCarPage().selectCarModel(model);
    }


    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {

        new NewUsedCarPage().selectLocationFromDropDown(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
         new NewUsedCarPage().selectPriceFromDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {

        new NewUsedCarPage().clickOnFindNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String  VerifyMessage)  {

        new NewUsedCarPage().verifyTheResult(VerifyMessage);
    }

    @And("^I click 'Used'link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to 'Used Cars For Sale'page$")
    public void iNavigateToUsedCarsForSalePage() {

    }
}
