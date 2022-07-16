package cydeo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "html:target/cucumber/report.html",
               "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"},
        features = "src/test/resources/features",
        publish = true
)
public class CukesRunner {}