package com.abc.automate;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/**
 * Main runner <br>
 * Runs all test
 *
 */
//@formatter:off
@RunWith(Cucumber.class)
@CucumberOptions(
    features    =   {   "src/test/resources/",
    },
    glue        =   {   "com.abc.automate" 
    },
    tags        =   "not @Ignore"
    ,
    plugin      =   {   "html:target/cucumber-html-report.html"}
    )
//@formatter:on
public class MainTest {

}
