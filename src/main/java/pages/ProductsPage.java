package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage  extends BasePage



{

	public ProductsPage(WebDriver driver)
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	 By search = By.id("search_product");
	 By searchGoButton = By.xpath("//button[@type='button' and @id='submit_search']");
	 By searchedproducttitle = By.cssSelector(".features_items>.title.text-center");
	 By allProducts = By.xpath("//h2[text()='All Products']");
	 By viewProduct = By.xpath("//a[@href='/product_details/1']");
	 By ProductList = By.cssSelector(".productinfo.text-center p");
	
	
	 
	 
	 
	 public boolean isProductTitle() 
	 {
	     return pageTitle().contains("Automation Exercise - All Products");
	 }
	
	
	 public boolean isProductPageUrl() 
	 {
	     return getCurrentUrl().contains("/products");
	 }
	
	 
	 public void clickViewProduct() 
	 {
	     click(viewProduct);
	 }
	
	 
	 public boolean isAllProduct() 
	 {
	     return isElementVisible(allProducts);
	 }
	
	
	 public void searchProduct(String productName)
	 {
	     type(search, productName);
	     click(searchGoButton);
	 }
	
	 
	 public boolean isSearchTitle() 
	 {
	     return isElementVisible(searchedproducttitle);
	 }
	

	 public ArrayList<String> productList() 
	 {
	     List<WebElement> searchedProductList = findElements(ProductList);
	     ArrayList<String> productList = new ArrayList<>();
	     for (WebElement search : searchedProductList) {
	         productList.add(search.getText());
	     }
	     return productList;
	 }
	
	
	 public boolean isSearchedResultDisplayed() 
	 {
	     return productList().size() > 0;
	 }

}
