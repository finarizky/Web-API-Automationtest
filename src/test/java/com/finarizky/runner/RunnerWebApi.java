package com.finarizky.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.finarizky"},
        features = {"src/test/resources"},
        plugin = {"pretty","html:reports/test-report.html", "json:reports/test-report.json"}
)

public class RunnerWebApi {
}
