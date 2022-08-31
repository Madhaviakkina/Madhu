package UtlisLayer;

import java.util.ArrayList;
import java.util.Set;

import BaseLayer.Baseclass;

public class HandleMultiplewindow extends Baseclass{
	
public static ArrayList<String> arr;
	
	public static String handletwowindows(Set<String> allwindows, String parent) {
		for (String abc : allwindows) {
			if (!abc.equals(parent)) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}
		return null;
	}

	public static String handleThreeWindows(String parent, String firstwindow, Set<String> allwindows) {
		for (String abc : allwindows) {
			if ((!abc.equals(parent)) && (!abc.equals(firstwindow))) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}
		return null;
	}

	public static String handleFourWindows(String parent, String firstwindow, String Secondwindow,
			Set<String> allwindows) {
		for (String abc : allwindows) {
			if ((!abc.equals(parent)) && (!abc.equals(firstwindow)) && (!abc.equals(Secondwindow))) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}
		return null;
	}

	// arrayList
	public static void HandlewindowswithArrayList(Set<String> allwindows, String parent, int index) {
		arr = new ArrayList<String>(allwindows);
		driver.switchTo().window(arr.get(index));
		// or
		driver.switchTo().window(new ArrayList<String>(allwindows).get(index));
	}

	public static void handleopenedwindows(String parent, int index) {
		driver.switchTo().window(arr.get(index));
	}

}
