package com.odooerp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= "com/odooerp/step_definitions",
        dryRun=false,
        strict = false,
        tags="@order_details",

        plugin = {"html:target/default-cucumber-reports",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
        }

)

        public class CucumberRunner {
}
