package com.cybertek.step_definitions;

import com.cybertek.pages.CybertekSchoolDropdownPracticePage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Map;


public class DataTablesStepDefinitions {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
    CybertekSchoolDropdownPracticePage cybertekSchoolDropdownPracticePage = new CybertekSchoolDropdownPracticePage();

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        for (String fruit : listOfFruits) {
            System.out.println(fruit);
        }
    }

    @Given("User is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }
    @When("User enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> credentials) {
        libraryLoginPage.usernameField.sendKeys(credentials.get("username"));
        libraryLoginPage.passwordField.sendKeys(credentials.get("password"));
        libraryLoginPage.signIn.click();
    }

    @Then("User should see title is Library")
    public void userShouldSeeTitleIsLibrary() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {

        Select monthDropdown = new Select(cybertekSchoolDropdownPracticePage.month);

        List<WebElement> actualMonthsAsWebElement = monthDropdown.getOptions();

        List<String> actualList = BrowserUtils.getElementsText(actualMonthsAsWebElement);

        Assert.assertEquals(expectedList,actualList);

    }

}
