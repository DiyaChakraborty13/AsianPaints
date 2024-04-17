package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resource\\Features\\WaterProofing.feature",
glue = "Step_Definition",
tags="@Scenario5"
//plugin = {"pretty","html:target/HTMLReports/asianpaintsReport.html",
//		"json:target/JSONReports/asainpaintsReports.json",
//      "junit:target/JUNITReport/asianpaints.xml",
//       "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runner extends AbstractTestNGCucumberTests{

	
}
