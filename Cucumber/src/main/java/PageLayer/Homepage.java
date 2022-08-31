package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class Homepage extends Baseclass{
	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement Homepagelogo;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);	
	}
	public boolean validatehomepagelogo() {
		return Homepagelogo.isDisplayed();
	}
	public String validatehomepageurl() {
		return driver.getCurrentUrl();
	}
	public String validatehomepagetitle() {
		return driver.getTitle();
	}



}
