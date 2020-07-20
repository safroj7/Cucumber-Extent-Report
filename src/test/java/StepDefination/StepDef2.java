package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef2 {

	
	@Given("^open the fb url part(\\d+)$")
	public void open_the_fb_url_part(int arg1) throws Throwable {
	  System.out.println("Hi..");
	}

	@When("^I provide username nd password part(\\d+)$")
	public void i_provide_username_nd_password_part(int arg1) throws Throwable {
		  System.out.println("Hi..");
	}

	@Then("^Enter the fb part(\\d+)$")
	public void enter_the_fb_part(int arg1) throws Throwable {
		  System.out.println("Hi..");
	}

}
