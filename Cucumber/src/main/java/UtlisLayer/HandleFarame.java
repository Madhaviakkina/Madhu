package UtlisLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class HandleFarame extends Baseclass{
	
	public static WebDriver switchframebyindex(int index) {
		return driver.switchTo().frame(index);
	}

	public static WebDriver switchframebyWebElement(WebElement wb) {
		return driver.switchTo().frame(wb);
	}

	public static WebDriver switchframebyidorname(String value) {
		return driver.switchTo().frame(value);
	}

	public static WebDriver switchtoParentFrame() {

		return driver.switchTo().parentFrame();
	}

	public static WebDriver swtichtotopFrame() {
		return driver.switchTo().defaultContent();
	}

}
