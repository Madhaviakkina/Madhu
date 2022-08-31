package StepDefinition;

import BaseLayer.Baseclass;
import PageLayer.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageTest extends Baseclass {

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   Baseclass.initialization();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   Loginpage login=new Loginpage();
	   login.loginfuntionatity();
	}

	@Then("user will be on homepage")
	public void user_will_be_on_homepage() {
	   System.out.println("user in on homepage");
	}
}
