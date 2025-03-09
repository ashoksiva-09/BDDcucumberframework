package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"java/org/steps"},
        tags = "@Regression",
        plugin = { "pretty", "html:target/cucumber-reports" }
)
public class Run extends AbstractTestNGCucumberTests {
}
