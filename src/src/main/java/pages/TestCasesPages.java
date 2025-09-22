package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPages extends BasePage


{

	public TestCasesPages(WebDriver driver)
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	 By bottomSubscribeOption = By.xpath("//div[@class='single-widget']//child::h2"); // if the below page oiption ius displayed then page is loaded
	 
	 public boolean isTestCasePage() 
	 {
	     return isElementVisible(bottomSubscribeOption);
	 }
	
	
	 public boolean isTestPageUrldisplayed() 
	 {
	     return getCurrentUrl().contains("/test_cases");
	 }
}
