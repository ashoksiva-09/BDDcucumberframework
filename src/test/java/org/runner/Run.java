package org.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = "C:\\Users\\Ashok\\IdeaProjects\\BDDCucumberframework\\src\\test\\resources\\features",
        glue = {"org.steps"},
        tags = "@Regression",
        plugin = { "pretty", "html:target/cucumber-reports" }
)
public class Run extends AbstractTestNGCucumberTests{
}
