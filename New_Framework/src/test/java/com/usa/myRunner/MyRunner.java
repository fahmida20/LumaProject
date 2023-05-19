package com.usa.myRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin=  {"pretty","json:target/cucumber.json"},
		features= ".//Features/",
		glue= {"com.usa.stepDefination", "com.usa.hooks"}
		)
public class MyRunner extends AbstractTestNGCucumberTests{

}
