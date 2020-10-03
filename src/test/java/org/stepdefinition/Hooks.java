package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
getDriver();
loadUrl("https://www.flipkart.com/");

	}
	@After
	public void afterScenario() {
quit();
	}

}
