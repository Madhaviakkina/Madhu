package UtlisLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.Baseclass;

public class ExtentReport extends Baseclass{
	public static ExtentSparkReporter sparkreporter;
	public static ExtentReports extent;
	
	public static  ExtentReports excelreportsetup() {
		sparkreporter=new ExtentSparkReporter("/CucumberBDD/Reports"+getDate()+"extentreport.html");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(sparkreporter);
		return extent;
	}
	
	public static String getPassScreenshot(String screenshotname) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\FWnew\\PassScreenshotfolder\\" + screenshotname + getDate() + ".png";
		FileUtils.copyFile(f, new File(dist));
		return dist;
	}

	public static String getFailedScrenshot(String screenshotname) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\FWnew\\FailScreenshot\\" + screenshotname + getDate() + ".png";

		FileUtils.copyFile(f, new File(dist));

		return dist;

	}

	public static String getDate() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

	}

	


}
