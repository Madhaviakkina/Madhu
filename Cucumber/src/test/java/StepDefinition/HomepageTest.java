package StepDefinition;

import org.testng.Assert;

import BaseLayer.Baseclass;
import PageLayer.Homepage;
import io.cucumber.java.en.Then;

public class HomepageTest extends Baseclass{
	
	Homepage homepage;
	

	@Then("check the logo")
	public void check_the_logo() {
		
		homepage=new Homepage();
		
		Assert.assertEquals(homepage.validatehomepagelogo(), true);
	}
	   

	@Then("check the url and Title of homepage")
	public void check_the_url_and_title_of_homepage() {
	    
	    Assert.assertEquals(homepage.validatehomepagetitle(),"OrangeHRM");
	    
	    Assert.assertEquals(homepage.validatehomepageurl().contains("hrm"),true);
	}

}
