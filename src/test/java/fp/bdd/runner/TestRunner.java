package fp.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "fp.bdd.steps",
        dryRun = false,
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/html_report/index.html",
                "json:target/jsonReports/jsonReport.json"
        }
)

public class TestRunner {
}
