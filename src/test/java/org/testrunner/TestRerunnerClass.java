package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;    

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src/test/resources/failedscenarios.txt", 
glue="org.stepdefinition",
plugin= {"html:target","json:target//report.json",
		
"rerun:src/test/resources/failedscenarios.txt"}
)
public class TestRerunnerClass {

}
