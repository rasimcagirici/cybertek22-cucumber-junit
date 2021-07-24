package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsySearchStepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("User should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "Etsy";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @When("User types {string} in the search bar")
    public void user_types_in_the_search_bar(String string) {
        etsySearchPage.searchBox.sendKeys(string);
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedInTitle = string;
       Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

}
