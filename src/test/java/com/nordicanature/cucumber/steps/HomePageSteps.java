package com.nordicanature.cucumber.steps;

import com.nordicanature.cucumber.stepsdef.HomePageStepsDef;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps {

	@Steps HomePageStepsDef homepageStepsDef;
	
	@Given("^i have logged into Nordic homepage$")
	public void openHomePage(){
		homepageStepsDef.openNordicHomePage();
	}
}
