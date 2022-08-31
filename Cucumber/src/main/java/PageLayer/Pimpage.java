package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;



public class Pimpage extends Baseclass{
	@FindBy(xpath = "//span[text()='PIM']")
	WebElement PIMpage;
	@FindBy(xpath = "//*[text()=' Add ']")
	WebElement clickonAddbutton;
	@FindBy(name = "firstName")
	WebElement firstname;
	@FindBy(name = "lastName")
	WebElement lastname;
	@FindBy(xpath = "//div[@class='orangehrm-employee-form']//input[@class='oxd-input oxd-input--active']")
	WebElement emplid;

	@FindBy(xpath = "//a[text()='Employee List']")
	WebElement employeelist;
	
	@FindBy(xpath="//label[text()='Employee Id']/following::div[1]/input[1]")
	WebElement empsearch;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-trash']")
	WebElement clickdelete;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Saveandsearch;
	@FindBy(xpath="//button[@type='button'][text()=' Yes, Delete ']")
	WebElement delete;
	
	
	
	public Pimpage() {
		PageFactory.initElements(driver, this);	
	}

	public String validatePimLink() {
			PIMpage.click();
		return driver.getCurrentUrl();
	}

	public String addNewUser(String fname, String lname) {
		
		clickonAddbutton.click();
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		String empid = emplid.getAttribute("value");
		Saveandsearch.click();
		return empid;
		}
	public void sesrchUser(String empid) throws InterruptedException {
		employeelist.click();
		empsearch.sendKeys(empid);
		Thread.sleep(4000);
		Saveandsearch.click();
		
	}
	public void deleteemp() {
		clickdelete.click();
		delete.click();
}
}
