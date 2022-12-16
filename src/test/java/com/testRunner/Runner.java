package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src/test/resources/features/LoginPage.feature",
		glue="com.stepDefinitionFiles",
		dryRun = false,
		monochrome=true,
		plugin = {"pretty","html:test-output"}
		
		)

public class Runner {
	
	


}
