package com.finarizky.runner.web;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.finarizky"},
        features = {"src/test/resources/web-demoblaze/Login.feature"},
        plugin = {"pretty","html:reports/web/cucumber_login.html", "json:reports/web/cucumber_login.json"}
)

public class LoginRunnerTest {
}
