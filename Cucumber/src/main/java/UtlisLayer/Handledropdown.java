package UtlisLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.Baseclass;

public class Handledropdown extends Baseclass{
	public static void selectDPbyvisibletext(WebElement wb,String value) {
		new Select(wb).selectByVisibleText(value);
	}
	public static void selectDPbyvalue(WebElement wb,String value) {
		new Select(wb).selectByValue(value);
	}
	public static void selectDPbyIndex(WebElement wb,int index) {
		new Select(wb).selectByIndex(index);
	}
	public static String getfirstselectedoptioninDP(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}
	public static int sizeofDP(WebElement wb) {
		return new Select(wb).getOptions().size();
	}
	public static void printalthevaluesindropdown(WebElement wb) {
		for(WebElement abc:new Select(wb).getOptions())
		{
			System.out.println(abc.getText());
		}
	}
	
	public static boolean printspecificvalueinDP(WebElement wb,String value) {
		for (WebElement abc : new Select(wb).getOptions())
		{
		if(abc.getText().equalsIgnoreCase(value))
		{
			return true;
		}
		}
		return false;
}
}
