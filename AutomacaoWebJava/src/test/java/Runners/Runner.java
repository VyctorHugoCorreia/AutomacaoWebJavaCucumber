package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
glue = "Steps",
plugin = "pretty",
monochrome = true,
snippets = SnippetType.CAMELCASE,
dryRun = false,
features = "src/test/resources/features/EnviarFormularioSampleApp.feature")
public class Runner {

}
