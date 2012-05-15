package sonar.test;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

/**
 * @author marwol
 */
@RunWith(Cucumber.class)
@Cucumber.Options(tags = { "@bean", "~@ignore" }, format = "html:target/cukes", features = "classpath:")
public class StupidTest {
}
