package ruuner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "./src/test/resources/Features/fblogin.feature",
glue = "stepdefinitions", 
tags = "@tag1 or @tag3"
//plugin = {"pretty", "html:target/cucumber-reports" },
//monochrome = true
)
public class RunTestNGTest extends AbstractTestNGCucumberTests {

}
