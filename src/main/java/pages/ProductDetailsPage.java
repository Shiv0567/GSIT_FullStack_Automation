package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage


{

	public ProductDetailsPage(WebDriver driver) 
	
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	 By productName = By.cssSelector(".product-information h2");
	 By category = By.cssSelector(".product-information p");
	 By cost = By.cssSelector(".product-information span span");
	 By quantity = By.id("quantity");
	 By availability = By.xpath("//b[contains(text(),'Availability:')]");
	 By condition = By.xpath("//b[contains(text(),'Condition:')]");
	 By brand = By.xpath("//b[contains(text(),'Brand:')]");

	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		 public boolean isProductTitle() 
		 {
		     return pageTitle().contains("Automation Exercise - Product Details");
		 }
		
		
		 public boolean isProductPageUrl() 
		 {
		     return getCurrentUrl().contains("/product_details/1");
		 }
		
		
		 public boolean isProductName()
		 {
		     return isElementVisible(productName);
		 }
		
		 
		 public boolean isCategory()
		 {
		     return isElementVisible(category);
		 }
		
		 public boolean isCost() 
		 {
		     return isElementVisible(cost);
		 }
		
		
		 public boolean isQuantity() 
		 {
		     return isElementVisible(quantity);
		 }
		
		
		 public boolean isAvailability() 
		 {
		     return isElementVisible(availability);
		 }
		
		
		 public boolean isCondition() 
		 {
		     return isElementVisible(condition);
		 }
		
		 public boolean isBrand() 
		 {
		     return isElementVisible(brand);
		 }
		
		 public void setQuantity(String quantity) {
		     findElement(this.quantity).clear();
		     type(this.quantity, quantity);
		 }

}
