package ui.core;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/main/java/ui/features",
glue= "ui.stepdifinition.registration",
        strict = true)
public class RegistrationTests {
}
