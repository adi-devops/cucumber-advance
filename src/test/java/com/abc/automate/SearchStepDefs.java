package com.abc.automate;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java8.En;

public class SearchStepDefs implements En{
	
	
	public SearchStepDefs(State state) {
		
		Given("I start a new browser", () -> {
		    state.driver = new WebDriverService().getDriver();
		});

		Given("I am on google search page", () -> {
		    state.driver.get("https://www.google.com");
		});

		When("I do a search for {string}", (String keyword) -> {
		    state.driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(keyword);
		});

		When("I click the search button", () -> {
			Thread.sleep(500);
			state.driver.findElement(By.xpath(".//input[@name='btnK']")).click();
		});
		
		Then("I should see title {word}", (String title) -> {
		    assertEquals(title,state.driver.getTitle());
		    state.driver.quit();
		    state.driver=null;
		});

	}

}
