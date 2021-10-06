package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	DemoProjectApplication demo = new DemoProjectApplication();
	public int a;
	public int b;
	public int result;
	
	@Given("^Two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void two_numbers_and(Integer string, Integer string2) {
		a=string;
		b=string2;
	}
	

	@When("^The sum method is called$")
	public void the_sum_method_is_called() {
		result = demo.sum(a, b);
	}

	@Then("Sum is {int}")
	public void sum_is(Integer int1) {
	   assertEquals(int1, result);
	}
}
