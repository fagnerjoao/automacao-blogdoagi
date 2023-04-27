package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json: target/reports/cucumberReport.json", "html: target/reports/cucumberReport.html"},
        features = "src/test/resources/features",
        tags = {"@busca"},
        glue = {"steps"}
)

public class Runner extends Driver {

    @AfterClass
    public static void stop(){
        driver.quit();
    }

}
