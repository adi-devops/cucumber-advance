package com.abc.automate;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;


import io.cucumber.java8.En;

public class ResultStepDefs implements En{
	
	public ResultStepDefs(State state) {

		Then("the first tile should be {string}", (String title) -> {
			String firstTitle=state.driver.findElement(By.xpath(".//div[@class='g'][1]/div/div/a/h3")).getText();
			assertEquals(title,firstTitle);
			state.driver.quit();
			state.driver=null;
		});

	}

}
