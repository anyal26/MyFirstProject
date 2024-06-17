package com.bigshop.hooks;
import com.bigshop.driver.CustomWebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHook {
    @Before
    public void setUp() {
        CustomWebDriverManager.getDriver();
    }

    @After
    public void tearDown() {
        CustomWebDriverManager.quitDriver();
    }
}