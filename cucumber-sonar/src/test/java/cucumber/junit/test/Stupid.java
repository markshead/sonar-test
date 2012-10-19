package cucumber.junit.test;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
