package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "inputEmail")
    public WebElement usernameField;

    @FindBy (id = "inputPassword")
    public WebElement passwordField;

    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signIn;

}
