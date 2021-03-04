package com.nordicnatural.cucumber.pageObject;

import net.serenitybdd.core.pages.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.nordicnatural.util.GenUtil;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;

public class HomePage extends PageObject {

	public void findAllLinks() {
		// Get list of web-elements
		List<WebElement> allLinks = getDriver().findElements(By.tagName("a"));

		// Link address
		for (WebElement link : allLinks) {
			try {
				if (link.getAttribute("href").contains("www.nordicnaturals.com")) {
					GenUtil.validateURL(link.getAttribute("href"));
				}
				
			} catch (Exception e) {

			}

		}

	}

}
