package Trunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature/featuresp.feature",
		glue = {"src/test/java/stepDefination"},
                format = {"json:target/cucumber.json"}
)

public class TestRunnr {

}
