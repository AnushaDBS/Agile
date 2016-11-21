package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	





@Given("^(\\d+),(\\d+)$")
public void _(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^added$")
public void added() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^(\\d+) should be provided.$")
public void should_be_provided(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}


}
