package com.nordicanature.cucumber.stepsdef;

import com.nordicnatural.cucumber.pageObject.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageStepsDef extends ScenarioSteps {

	private HomePage homepage;
	@Step
	public void openNordicHomePage() {
		homepage.open();
		getDriver().manage().window().maximize();
		
	}
	
	@Step
	public void verifyNordicHomePageURL() {
		homepage.findAllLinks();
	}
}
