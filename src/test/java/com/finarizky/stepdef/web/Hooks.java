package com.finarizky.stepdef.web;

import com.finarizky.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public static void  setup(){
        BaseTest.getDriver();
    }

    @After
    public static void  quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        BaseTest.quitDriver();
    }
}
