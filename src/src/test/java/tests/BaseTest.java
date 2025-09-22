package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import drivers.DriverFactory;
import drivers.DriverManager;
import utils.ConfigReader;

public class BaseTest {
	
	public static final Logger logger = LogManager.getLogger(BaseTest.class);
	
	
	
	
	@Parameters({"os","browser"})
	@BeforeMethod
	public void setup(String os,String browser)
	{
		WebDriver driverref = DriverFactory.createDriver(browser);
		DriverManager.setDriver(driverref);
		DriverManager.getDriver().get(ConfigReader.get("base.url"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		if(DriverManager.getDriver() != null)
		{
			DriverManager.getDriver().quit();
			DriverManager.removeDriver();
		}
		
	}
}
