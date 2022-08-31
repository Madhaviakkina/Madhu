package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"AllFeatures"},
				 glue= {"StepDefinition"},
				dryRun=false,
				plugin= {"html:Reports/login.html","json:Reports/login.json"},
				monochrome=true,
				tags="@login or @homepage or @pimpage"
				)
public class TestRunner {

}
