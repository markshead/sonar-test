package sonar.test;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

/**
 * @author marwol
 */
public class Stupid {

  private Bean<?> bean;

  @Given("^I have a Bean$")
  public void createBean() {
    bean = new Bean();
  }

  @When("^I set the name to \"([^\"]+)\"$")
  public void setName(String name) {
    bean.setName(name);
  }

  @Then("^the getter should return \"([^\"]+)\"$")
  public void getName(String name) {
    assertThat(bean.getName(), is(name));
  }

}
