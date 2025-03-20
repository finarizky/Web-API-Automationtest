package com.finarizky.stepdef.web;

import com.finarizky.BaseTest;
import com.finarizky.page.web.HomepagePage;
import com.finarizky.page.web.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepdef extends BaseTest {

    LoginPage loginpage;
    private WebDriver driver;
    HomepagePage homepagepage;

    String loggedInUsername;

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        driver = getDriver();
        loginpage = new LoginPage(driver);
        loginpage.goToLandingPage();
    }

    @When("User click header menu login")
    public void userClickHeaderMenuLogin() {

        loginpage.headerMenuLogin();
    }

    @And("User input username with {string}")
    public void userInputUsernameWith(String username) {

        loggedInUsername = username;
        loginpage.inputUsername(username);
    }

    @And("User input password with {string}")
    public void userInputPasswordWith(String password) {

        loginpage.inputPassword(password);
    }

    @And("User click button login")
    public void userClickButtonLogin() {

        loginpage.clickButtonLogin();
    }

    @Then("User able to see popup {string}")
    public void userAbleToSeePopup(String doesntExist) {

        loginpage.userDoesntExist(doesntExist);
    }

    @And("User click button close")
    public void userClickButtonClose() {

        loginpage.clickButtonCancel();
    }

    @Then("User back to landing page")
    public void userBackToLandingPage() {

        loginpage.validateOnLandingPage();
    }

    @Then("User is success login")
    public void userIsSuccessLogin() {

        homepagepage = new HomepagePage(driver);

        String actualMessage = homepagepage.validateOnHomepage();
        String expectedMessage = "Welcome " + loggedInUsername;

        System.out.println("Expected: " + expectedMessage);
        System.out.println("Actual  : " + actualMessage);
        assertEquals(expectedMessage, actualMessage, "Welcome message is incorrect");
    }
}
