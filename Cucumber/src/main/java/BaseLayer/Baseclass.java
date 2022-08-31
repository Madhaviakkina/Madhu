package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public Baseclass() {
	prop=new Properties();
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Cucumber\\src\\main\\java\\ConfigLayer\\config.properties");
		prop.load(fis);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
	public static void initialization()
	{ String Browsername=prop.getProperty("browsername");
	
	if(Browsername.equalsIgnoreCase("chrome"))
	{	WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	else if(Browsername.equalsIgnoreCase("edge"))
	{	WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}
	
	else if(Browsername.equalsIgnoreCase("ie"))
	{	WebDriverManager.iedriver().setup();
		 driver=new InternetExplorerDriver();
	}
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get(prop.getProperty("url"));	
	}
}

