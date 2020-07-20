package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"G:\\Afroz Study\\Java\\Oxygen Eclips\\Oxygen Workspace\\com.CucumberExtent\\Features\\Sample1.feature","G:\\Afroz Study\\Java\\Oxygen Eclips\\Oxygen Workspace\\com.CucumberExtent\\Features\\Sample2.feature"},
                 glue = {"StepDefination"}, 
                plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html " }, 
                 monochrome = true)

public class TestRunner {

	
@AfterClass
	public static void setup()
	{
		
		// Add external info in Extent report
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));//Here provide extent-config.xml file path
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Afroj");
	Reporter.setSystemInfo("Application Name", "Facebook");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "QA");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	
	}
}
