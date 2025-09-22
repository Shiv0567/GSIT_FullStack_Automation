package drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utils.ConfigReader;

public class DriverFactory {
	
	

	// This method initializes the WebDriver based on the provided browser name.
	// The browser name is passed as a string and converted to lowercase to avoid case sensitivity issues.
	// A switch-case statement is used to select the appropriate browser driver.
	// The browser window is then maximized, and an implicit wait is applied to ensure the window loads completely.
	// If the browser name is not recognized, an IllegalArgumentException is thrown.
	
	public static WebDriver createDriver(String browser)
	{
		WebDriver driver = null;
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("Browser name is not supported: " + browser + "only the following browsers as available "
					+ "chrome , firefox,safari");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.get("implicitWait")))); // Apply implicit wait to handle element loading delays
		
		return driver;
		
	}

	
}

