package Cucumberoption;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Data.Dataprovider;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
		features = "src/test/java/feature/smoke.feature",

		format=	{"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/re-run.txt"},
		glue = "stepdefination",
		tags={"~@Test"},

		monochrome=true,//display the console output in proper readable format
		strict=true,//it will check if any step is not defined in the step defination file 
		dryRun =false)//to check the mapping is proper bet feature file and the step defination file
public class TestRunner extends Dataprovider{
	public TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	
	
	}
	@After()
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver)
	                        .getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png"); //stick it in the report
	    }
	    driver.close();
	}
}



