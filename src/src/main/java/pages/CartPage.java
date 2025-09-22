package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage

{

	public CartPage(WebDriver driver) 
	
	
	{
		super(driver);
	}
	
	
	
	
	By SubscriptionHeading = By.xpath("//h2[text()='Subscription']");
	By subscribeEmail = By.id("susbscribe_email");
	By SubscribeGo = By.id("subscribe");
	
	
	
	
	public boolean isCartTitle()
	{
		return pageTitle().contains("Automation Exercise - Checkout");
	}
	

	
	public void enterSubscribeEmail(String email)
	{
		JavaScriptExecutor(findElement(subscribeEmail));
		type(subscribeEmail,email);
	}
	
	public void clickSubscribe()
	{
		click(SubscribeGo);
	}
	
	public boolean isCartUrl()
	{
		return getCurrentUrl().contains("/view_cart");
	}

	
	public boolean isSubscribed()
	{
		return isElementVisible(SubscriptionHeading);
	}
	
	

}
