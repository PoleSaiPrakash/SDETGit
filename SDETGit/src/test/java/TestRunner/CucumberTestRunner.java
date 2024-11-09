package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/resources/Features"},
glue= {"StepDefinitions"},
plugin= {"pretty","html:target/htmlReport.html","json:target/Report.json"},
tags="",dryRun=false)

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
