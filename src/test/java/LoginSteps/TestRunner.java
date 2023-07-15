package LoginSteps;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Feature",glue= "LoginSteps", dryRun = false, monochrome = true, plugin= 
{"pretty","html:target","junit:target\\sample.xml", "json:target\\output.json"},tags={"@Smoketest and @RegressionTest"})
public class TestRunner extends Libglobal {


@AfterClass

public static void afterScenario() {
	Reporting.generateJVMReport(getProjectPath()+ "\\target\\output.json");
}
}


