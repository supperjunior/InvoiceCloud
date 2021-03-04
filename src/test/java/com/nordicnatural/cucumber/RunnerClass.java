package com.nordicnatural.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/main/resources/features"},
							glue={"com.nordicanature.cucumber.steps"}) 

public class RunnerClass {

}
