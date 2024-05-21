package stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinitions",
        plugin= {"pretty", "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"}
)
public class RunCucumberTest {
    // This class is for running Cucumber tests
}





