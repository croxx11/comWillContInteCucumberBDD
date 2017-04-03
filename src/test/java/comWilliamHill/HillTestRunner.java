package comWilliamHill;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 02/04/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/ResourceCap",                     
        plugin = {"html:target/cucumber"},
        tags = "@EMMY",
        // format = {"html:target/cucumber"},
        monochrome = false


)

public class HillTestRunner {
}
