package com.finarizky.stepdef.api;

import com.finarizky.page.api.PostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PostStepdef {

    PostPage postPage = new PostPage();
    Response response;
    String dynamicEmail;

    @When("User sends a POST request to create a user with:")
    public void userSendsAPOSTRequestToCreateAUserWith(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> userData = new HashMap<>(dataTable.asMap());
        dynamicEmail = "test.api" + System.currentTimeMillis() + "@example.com";

        if (userData.containsKey("email") && userData.get("email").equals("dynamic")) {
            userData.put("email", dynamicEmail);
        }
        response = postPage.createUser(userData);
    }

    @And("The email should contain the correct email")
    public void theEmailShouldContainTheCorrectEmail() {

        String actualEmail = response.jsonPath().getString("email");
        assertEquals(dynamicEmail, actualEmail);
    }

    @And("The first name should be {string}")
    public void theFirstNameShouldBe(String expectedFirstName) {

        String actualFirstName = response.jsonPath().getString("firstName");
        assertEquals(expectedFirstName, actualFirstName);
    }

    @And("The response body should contain error {string}")
    public void theResponseBodyShouldContainError(String expectedError) {

        String actualError = response.jsonPath().getString("error");
        assertEquals(expectedError, actualError);
    }

    @And("The response body should contain email message {string}")
    public void theResponseBodyShouldContainEmailMessage(String expectedEmailMessage) {

        String actualEmailMessage = response.jsonPath().getString("data.email");
        assertEquals(expectedEmailMessage, actualEmailMessage);
    }

    @And("The response body should contain firstName message {string}")
    public void theResponseBodyShouldContainFirstNameMessage(String expectedfNameMessage) {

        String actualfNameMessage = response.jsonPath().getString("data.firstName");
        assertEquals(expectedfNameMessage, actualfNameMessage);
    }

    @And("The response body should contain lastName message {string}")
    public void theResponseBodyShouldContainLastNameMessage(String expectedlNameMessage) {

        String actuallNameMessage = response.jsonPath().getString("data.lastName");
        assertEquals(expectedlNameMessage,actuallNameMessage);
    }

    @Then("The response create status should be {int}")
    public void theResponseCreateStatusShouldBe(int expectedStatusCode) {

        assertEquals(expectedStatusCode, response.getStatusCode());
    }


    @And("The response body should contain firstname required {string}")
    public void theResponseBodyShouldContainFirstnameRequired(String expectedFirstNameRequired) {

        String actualError = response.jsonPath().getString("data.firstName");
        assertEquals(expectedFirstNameRequired, actualError);
    }
}
