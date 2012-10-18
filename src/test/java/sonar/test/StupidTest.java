package sonar.test;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

/**
 * @author marwol
 */
@RunWith(Cucumber.class)
@Cucumber.Options(tags = { "@bean", "~@ignore" }, format = "junit:target/reports/TEST-sonar.test.StupidTest.xml", features = "classpath:")
public class StupidTest {
}
