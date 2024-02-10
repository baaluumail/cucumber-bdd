package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features"
,glue= {"stepDefinitions"},
plugin = { "pretty" },
monochrome = true

)

public class testrunner {
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}

