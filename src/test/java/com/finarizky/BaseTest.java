package com.finarizky;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }
}
