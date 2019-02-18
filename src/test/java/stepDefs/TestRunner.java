package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "D:/ExcelDataRead/src/test/Features",
        glue = {"stepDefs"},
        format =  {"pretty", "html:target/destination" +
                ""}
)
public class TestRunner {
}
