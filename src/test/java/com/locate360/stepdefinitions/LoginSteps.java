package com.locate360.stepdefinitions;

import com.locate360.base.BaseClass;
import com.locate360.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginSteps {
    private final LoginPage login = new LoginPage();

    @Given("user launches the Locate360 Telecaller Panel")
    public void launch() { BaseClass.launchBrowser(); BaseClass.openApplication(); }

    @Then("login page should be displayed")
    public void verifyLoginPage() { assertTrue(BaseClass.getDriver().getTitle() != null); }

    @When("user enters email {string}")
    public void enterEmail(String email) { login.enterEmail(email); }

    @When("user enters password {string}")
    public void enterPassword(String password) { login.enterPassword(password); }

    @When("user clicks Sign In")
    public void clickSignIn() { login.clickSignIn(); }

    @Then("password should be masked")
    public void verifyMasking() { assertTrue(login.isPasswordMasked()); }

    @Then("Forgot Password should be visible")
    public void forgotVisible() { assertTrue(login.isForgotPasswordDisplayed()); }

    @Then("user should leave the login page")
    public void successfulLogin() throws InterruptedException {
        Thread.sleep(1500);
        assertFalse("Login appears unsuccessful; verify test credentials or application behavior.", login.getCurrentUrl().equals(BaseClass.URL) || login.getCurrentUrl().equals(BaseClass.URL + "/"));
    }

    @After
    public void tearDown() { BaseClass.closeBrowser(); }
}
