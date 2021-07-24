package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }

    @When("User enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }

    @When("User enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }

    @When("User enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username");
    }

    @When("User enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password");
    }

    @When("User enters admin username")
    public void user_enters_admin_username() {
        System.out.println("User enters admin username");
    }

    @When("User enters admin password")
    public void user_enters_admin_password() {
        System.out.println("User enters admin password");
    }

}
