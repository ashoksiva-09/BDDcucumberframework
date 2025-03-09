package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"java"},
        tags = "@Test"
)
public class Run extends AbstractTestNGCucumberTests {
}
