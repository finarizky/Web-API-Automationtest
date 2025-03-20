package com.finarizky;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.finarizky"},
        features = {"src/test/resources/web-demoblaze/Homepage.feature"},
        plugin = {"pretty","html:reports/cucumber_homepage.html", "json:reports/cucumber_homepage.json"}
)

public class HomepageRunner {
}
