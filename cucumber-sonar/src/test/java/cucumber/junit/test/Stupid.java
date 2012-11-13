package cucumber.junit.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stupid {

    private CucumberTestBean<?> bean;

    @Given("^I have a Bean$")
    public void createBean() {
        bean = new CucumberTestBean();
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
