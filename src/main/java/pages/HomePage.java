package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage 

{

	
	
	By homePageHeading = By.xpath("//span[text()='Automation']");
	By bottomLine = By.xpath("//div[@class='single-widget']//child::h2");
	By signUpORLogin =  By.xpath("//a[normalize-space(text())='Signup / Login']");
	By contactUs =  By.cssSelector("a[href='/contact_us']");
	By testCase = By.cssSelector("a[href='/test_cases']");
	By product = By.cssSelector("a[href='/products']");
	By subscribeEmail = By.id("susbscribe_email");
	By subscribeButton =By.id("subscribe");
	By subscribeSuccessNotification = By.cssSelector("#success-subscribe .alert-success.alert");
	By cart = By.cssSelector("a[href='/view_cart']");
	
	
	
	
	public HomePage(WebDriver driver) 
	
	{
		super(driver);
		
	}
	
	
	
	// methods for the homepage and basic methods used across the test cases
	
	
	
	 
	 public boolean homePageIsDisplayed()
		{
			return isElementVisible(homePageHeading);
		}
	 
	 
	
		 public void clickSignUpORLogin() 
		 {
		     click(signUpORLogin);
		 }
		
	
		
		
		 public void enterSubscribeEmail(String email)
		 
		 
		 {
		     JavaScriptExecutor(findElement(subscribeEmail));
		     type(subscribeEmail, email);
		 }
		
		 
		 
		 public void clickOnTestCase() 
		 {
		     click(testCase);
		 }
		
		 
		 public void clickSubscribeButton() 
		 
		 
		 {
		     click(subscribeButton);
		 }
		
		
		 public boolean isSubscribe() 
		 
		 {
		     return isElementVisible(subscribeSuccessNotification);
		 }
		
		 public void clickOnCart() 
		 
		 
		 {
		     click(cart);
		 }

	
		 
		 public void clickOnContactUs() 
		 {
		     click(contactUs);
		 }
		
		
		
		 
		 public void clickOnProduct()
		 
		 
		 {
		     click(product);
		 }

}
