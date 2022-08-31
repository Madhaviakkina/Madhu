package StepDefinition;
import BaseLayer.Baseclass;
import PageLayer.Pimpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class PimpageTest extends Baseclass{
public static Pimpage pim;
String empid;


	@Given("user is on pimpage and check url")
	public void user_is_on_pimpage_and_check_url() {
		pim=new Pimpage();
		
		Assert.assertEquals(pim.validatePimLink().contains("pim"),true);
	}
	@Then("click on add button to add employee with {string} and {string} save the details")
	public void click_on_add_button_to_add_employee_with_and_akkina_save_the_details(String fname, String lname) {
		  empid=pim.addNewUser(fname, lname);
	}
	

	@Then("user should be able to search the emplyoee which is added")
	public void user_should_be_able_to_search_the_emplyoee_which_is_added() throws InterruptedException {
	    pim.sesrchUser(empid);
	}

	@Then("should be able to delete the employee")
	public void should_be_able_to_delete_the_employee() {
	  pim.deleteemp();
	}
}
