package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage 

{

	public AccountCreatedPage(WebDriver driver)
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	By accountCreated = By.xpath("//h2//b[text()='Account Created!']");
	
	
	@FindBy (xpath="//a[text()='Continue']")
			WebElement continuetest;
	
	
	
	public boolean isAccCretedMsg() 
	{
		return isElementVisible(accountCreated);
	}
	
	
	public void continueClick()
	{
		continuetest.click();
	}

	
	
	
}
