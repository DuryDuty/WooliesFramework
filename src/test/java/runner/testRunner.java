package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = { "stepDefinitions" })
public class testRunner extends AbstractTestNGCucumberTests {

}