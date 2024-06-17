package com.bigshop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/login/Login.feature"},
        glue = {"com.bigshop.steps", "com.bigshop.hooks"},
        tags = "@Regression",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                //             "xml:test-output/cucumber-reports/Cucumber.xml",
                "html:test-output/cucmber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class JUnitRunTest {

}
