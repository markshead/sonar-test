package sonar.test;

import cucumber.api.junit.Cucumber;
import cucumber.junit.CucumberForSonar;
import org.junit.runner.RunWith;

/**
 * @author marwol
 */
@RunWith(CucumberForSonar.class)
@Cucumber.Options(tags = { "@bean", "~@ignore" },  features = "classpath:")
public class StupidTest {
}
