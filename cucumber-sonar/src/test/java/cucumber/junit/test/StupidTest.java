package cucumber.junit.test;

import cucumber.junit.Cucumber;
import cucumber.junit.CucumberForSonar;
import org.junit.runner.RunWith;

@RunWith(CucumberForSonar.class)
@Cucumber.Options(tags = { "@bean", "~@ignore" },  features = "classpath:")
public class StupidTest {
}
