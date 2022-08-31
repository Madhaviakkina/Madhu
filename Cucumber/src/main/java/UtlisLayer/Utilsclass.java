package UtlisLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class Utilsclass extends Baseclass{
	
public static void getPassScreenshot(String Screenshotname) throws IOException {
		
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String date=new SimpleDateFormat("ddMMYYYY_HHMMSS").format(new Date());
		String dist=System.getProperty("user.dir")+"/FWnew/PassScreenshotfolder/"+Screenshotname+date+".png";
		FileUtils.copyFile(f, new File(dist));
	}
public static void getFailScreenshot(String Screenshotname) throws IOException {
		
		
		File f=(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		String date=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		String dist=System.getProperty("user.dir")+"/FWnew/FailScreenshot/"+Screenshotname+date+".png";
		FileUtils.copyFile(f, new File(dist));
	}
public static void datepicker(WebElement currentmonthandyear,String expectedmonthandyear,WebElement clicknext,WebElement date) {
	
	while(true)
	{
		String a=currentmonthandyear.getText();
		if(a.equalsIgnoreCase(expectedmonthandyear))
		{
			break;
		}
		else
		{
			clicknext.click();
		}
	}

	date.click();
}
}
