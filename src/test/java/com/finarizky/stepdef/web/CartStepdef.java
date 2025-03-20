package com.finarizky.stepdef.web;

import com.finarizky.BaseTest;
import com.finarizky.page.web.HomepagePage;
import com.finarizky.page.web.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CartStepdef extends BaseTest {

    private WebDriver driver;
    HomepagePage hompagepage;
    LoginPage loginpage;

    @And("User click menu cart")
    public void userClickMenuCart() {
    }

    @And("User click product Nokia lumia {int}")
    public void userClickProductNokiaLumia(int arg0) {
    }

    @And("User click button add to cart")
    public void userClickButtonAddToCart() {
    }

    @Then("User able to see warning popup {string}")
    public void userAbleToSeeWarningPopup(String arg0) {
    }

    @And("User click product Iphone {int} {int}gb")
    public void userClickProductIphoneGb(int arg0, int arg1) {
    }

    @And("User click button ok")
    public void userClickButtonOk() {
    }

    @And("User click button delete")
    public void userClickButtonDelete() {
    }

    @Then("User success delete product")
    public void userSuccessDeleteProduct() {
    }

    @And("User click product HTC One M{int}")
    public void userClickProductHTCOneM(int arg0) {
    }

    @And("User click button place order")
    public void userClickButtonPlaceOrder() {
    }

    @And("User input name with {string}")
    public void userInputNameWith(String arg0) {
    }

    @And("User input country with {string}")
    public void userInputCountryWith(String arg0) {
    }

    @And("User input city with {string}")
    public void userInputCityWith(String arg0) {
    }

    @Then("User input credit card with {string}")
    public void userInputCreditCardWith(String arg0) {
    }

    @And("User input month with {string}")
    public void userInputMonthWith(String arg0) {
    }

    @And("User input year with {string}")
    public void userInputYearWith(String arg0) {
    }

    @And("User click button purchase")
    public void userClickButtonPurchase() {
    }

    @And("User click button close checkout")
    public void userClickButtonCloseCheckout() {
    }

    @Then("User is on Cart page")
    public void userIsOnCartPage() {
    }
}
