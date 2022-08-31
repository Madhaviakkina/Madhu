package UtlisLayer;

import BaseLayer.Baseclass;

public class Alertpop extends Baseclass{
	public static void clickokonAlert() {
		driver.switchTo().alert().accept();
	}
	public static void clickokoncancel() {
		driver.switchTo().alert().dismiss();
	}
	public static String capturethevisibletext() {
		return driver.switchTo().alert().getText();
	}
	public static void enterdatainAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	

}
