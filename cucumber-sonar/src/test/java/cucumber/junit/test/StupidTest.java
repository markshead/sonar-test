package cucumber.junit.test;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.junit.CucumberForSonar;

@RunWith(CucumberForSonar.class)
@Cucumber.Options(tags = { "@bean", "~@ignore" },  features = "classpath:")
public class StupidTest {
}
