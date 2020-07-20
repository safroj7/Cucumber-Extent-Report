package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public  WebDriver driver;
	
	@Given("^open the fb url$")
	public void open_the_fb_url()  {
	    System.out.println("Allaha...");
	}

	@When("^I provide username nd password$")
	public void i_provide_username_nd_password()  {
		 System.out.println("Allaha...");
	}

	@Then("^Enter the fb$")
	public void enter_the_fb() {
		 System.out.println("Allaha...");
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("www.facebook.com");
	}

	
	

}
