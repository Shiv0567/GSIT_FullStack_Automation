package pages;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage 


{
	
	// this page has the repeated actions to be followed for each test case / test page
	
	
			public WebDriver driver;    // webdriver instance for browser interactgion
			
			
			 JavascriptExecutor js;    // javascript edecutor instance
			
			 public void JavaScriptExecutor(WebElement element) 
			 {
			     js.executeScript("arguments[0].scrollIntoView(true);", element);
			 }
			 
			 
			// constructor for the webdriver intilization
			
			public BasePage(WebDriver driver)
			{
				this.driver = driver;
				this.js = (JavascriptExecutor)driver;
			}

			
			
			
			
			public void click(WebElement locator)
			{
				locator.click();
//				driver.findElement(locator).click();
			}
			
			public void type(WebElement locator, String text)
			{
				locator.clear();
				locator.sendKeys(text);
//				WebElement element = driver.findElement(locator);
//				element.clear();
//				element.sendKeys(text);
			}
			
			public String getText(WebElement locator)
			{
				return locator.getText();
			}	
		
			 public WebElement findElement(By locator) {
			     return driver.findElement(locator);
			 }
			 
			 public boolean isElementVisible(By locator) 
			 {
			     try 
			     {
			         return findElement(locator).isDisplayed();
			     } catch (Exception e) {
			         return false; 
			     }
			 }
			
			 public void click(By Locator) 
			 {
			     driver.findElement(Locator).click();
			 }
			
			 

			 public void type(By Locator, String text) 
			 {
			     driver.findElement(Locator).clear();
			     driver.findElement(Locator).sendKeys(text);
			 }
			
			 
			 public void selectDropDown(By Locator, String day) 
			 {
			     Select select = new Select(driver.findElement(Locator));
			     select.selectByVisibleText(day);
			 }
			
			
			 
			 
			
			 
			

			 
			 
			 public List<WebElement> findElements(By locator) 
			 {
			     return driver.findElements(locator);
			 }
			
			 
			 
			 
			 public String getAttribute(By locator) 
			 {
			     return findElement(locator).getAttribute("value");
			 }
			
			 
			
			 
			 
			 public Alert switchToAlert() 
			 
			 
			 {
			     return driver.switchTo().alert();
			 }
			
			 
			 
			 
			   
			 
			 public void acceptAlert() 
			 {
			     switchToAlert().accept();
			 }
			
			
			 
			 public void dismissAlert() 
			 {
			     switchToAlert().dismiss();
			 }
			
			
			 
			 
			 public String getAlertText() 
			 
			 {
			     return switchToAlert().getText();
			 }
			
			 
			 
			 
			 
			 public String getCurrentUrl() 
			 {
			     return driver.getCurrentUrl();
			 }
			
			 
			
			 
			 public String pageText(By locator) 
			 
			 {
			     return driver.findElement(locator).getText();
			 }
			
			 
			 
			
			
			
			 
			 public String pageTitle() 
			 {
			     return driver.getTitle();
			 }
			 
			 
			 
			
			 
			 
			 
			 
			 
			
}
