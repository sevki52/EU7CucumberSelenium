package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = true,
        tags = "@wip"
//      tags = {"@driver", "@VYT_123"} old version

)
public class CukesRunner {

}
