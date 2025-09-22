package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends BasePage

{

	public DeleteAccountPage(WebDriver driver) 
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	By accountDeleteMessage =By.xpath("//h2[@class='title text-center']//child::b"); 
	
	@FindBy (xpath="//a[text()='Continue']")
		 WebElement continuebutton;
	
	
	
	
	
	public boolean isAccDeleted()
	{
		return isElementVisible(accountDeleteMessage);
		
	}
	
	public void continueClick()
	{
		continuebutton.click();
	}

	
	

}
