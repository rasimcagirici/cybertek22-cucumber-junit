package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaSearchStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        String url = ConfigurationReader.getProperty("wikipediaUrl");
        Driver.getDriver().get(url);
    }

    @When("User types {string} in the wiki search bar")
    public void userTypesInTheWikiSearchBar(String arg0) {
        wikiSearchPage.searchBar.sendKeys(arg0);
    }

    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wikiSearchPage.submitButton.click();
    }

    @Then("User should see {string} in the wiki title")
    public void userShouldSeeInTheWikiTitle(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(arg0));
    }


    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String arg0) {
        String actualHeader = wikiSearchPage.mainHeader.getText();
        Assert.assertEquals(arg0,actualHeader);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheMageHeader(String arg0) {
        String acutalImageHeader = wikiSearchPage.imageHeader.getText();
        Assert.assertEquals(arg0,acutalImageHeader);

    }
}
