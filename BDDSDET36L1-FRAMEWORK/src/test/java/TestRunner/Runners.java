package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {".\\src\\test\\java\\Features"},
	glue = {"StepDefinationsAndHooks"},
		dryRun = false,
		monochrome = true,
		//tags = "",
		plugin = {
				"pretty",
				"html:VtigerCucumber.html",
				"json:VtigerCucumber.json"
		}
		
		)
public class Runners  extends AbstractTestNGCucumberTests{

}
