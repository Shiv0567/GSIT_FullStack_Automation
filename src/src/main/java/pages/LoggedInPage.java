package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInPage extends BasePage 


{
	
	
	
	public LoggedInPage(WebDriver driver) 
	 
	 
	 {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	 @FindBy(xpath="//i[@class='fa fa-trash-o']/parent::a")
	 WebElement deleteAccount ;
	
	 By loggedInUserName = By.xpath("//i[@class='fa fa-user']/parent::a");
	 
	 By logout = By.xpath("//i[@class='fa fa-lock']//parent::a");
	 
	 
	 
	 
	 public boolean isUserLoogedIn() 
	 {
	     return isElementVisible(loggedInUserName);
	 }
	
	 
	 public String getLoggedInUserName() 
	 {
	     return driver.findElement(loggedInUserName).getText();
	 }
	

	 public void clickDeleteAcc() 
	 {
		 deleteAccount.click();
	 }
	
	
	 public void clickOnLogout() 
	 {
	     click(logout);
	 }

}
