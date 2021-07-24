package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before (value = "@librarian or @student",order = 1)
    public void setupScenario() {
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        //Driver.closeDriver();
    }

    @BeforeStep
    public void setupSetup() {
        System.out.println("--setup applying for each step...");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("--teardown applying for each step...");
    }
}
