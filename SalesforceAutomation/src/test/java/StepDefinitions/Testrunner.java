package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFile",glue={"StepDefinitions"},
tags= "@CreateOpportunity")
//plugin= {"pretty","junit:taget/JUnitReports/report.xml","json:target/JSONReports/report.json",
		//"html:target/HtmlReports"})

public class Testrunner {

}
