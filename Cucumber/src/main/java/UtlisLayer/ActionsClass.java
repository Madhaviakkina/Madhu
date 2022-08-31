package UtlisLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.Baseclass;

public class ActionsClass extends Baseclass{
	public static Actions act;

	public static void clickonElement(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}

	public static void doubleclickonElement(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}

	public static void rightclickonelement(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}

	public static void mouseoveronelement(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}

	public static void mouseoveronelementandclick(WebElement wb, WebElement click) {
		new Actions(driver).moveToElement(wb).click(click).build().perform();
	}

	public static void draganddroptheelement(WebElement src, WebElement trg) {
		new Actions(driver).dragAndDrop(src, trg).build().perform();
	}

	public static void clickandholdtheelement(WebElement src) {
		new Actions(driver).clickAndHold(src).build().perform();
	}

	public static void releasethelement(WebElement trg) {
		new Actions(driver).release(trg).build().perform();
	}

	public static void enterDatawithsendKeys(WebElement wb, String value) {
		new Actions(driver).sendKeys(wb, value).build().perform();
	}

	public static void enterDatainUpperCase(WebElement wb, String value) {
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(Keys.SHIFT).build().perform();
	}

	public static void moveEndpage() {
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}

	public static void moveToHomepage() {
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}

	public static void copyTextfromTextbox() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
				.build().perform();
	}

	public static void pasteTextinTextBox() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}


