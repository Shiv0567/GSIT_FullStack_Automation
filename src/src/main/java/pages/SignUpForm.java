package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpForm extends BasePage


{

	public SignUpForm(WebDriver driver)
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	 By AccountInfoTitle = By.xpath("//h2[@class='title text-center']//child::b");
	 By password = By.xpath("//input[@class='form-control' and @id='name']");
	 By day = By.id("days");
	 By month = By.id("months");
	 By year = By.id("years");
	 By newsletterCheckBox = By.id("newsletter");
	 By SpecialOffercheckBox = By.id("optin");
	 By firstName = By.xpath("//input[@name='first_name']");
	 By lastName = By.xpath("//input[@name='last_name']");
	 By companyName = By.id("company");
	 By address = By.id("address1");
	 By country = By.id("country");
	 By state = By.id("state");
	 By city = By.id("city");
	 By zipcode = By.id("zipcode");
	 By mobileNumber = By.id("mobile_number");
	 By createAccountButton = By.xpath("//button[@data-qa='create-account']");
	 By accountCreated = By.xpath("//h2//b[text()='Account Created!']");
	 By continueButton = By.xpath("//a[text()='Continue']");
	
	 
	 
	 
	
	
	
	
	
	 public void setPassword(String password)
	 {
	     type(this.password, password);
	 }
	
	 
	 public void selectDay(String day)
	 {
	     selectDropDown(this.day, day);
	 }
	
	 public void selectMonth(String month) {
	     selectDropDown(this.month, month);
	 }
	
	 public void selectYear(String year) 
	 {
	     selectDropDown(this.year, year);
	 }
	
	
	 public void enableNewsletterSignup() 
	 {
	     click(newsletterCheckBox);
	 }
	
	 
	 public void clickSpecialOffersCheckbox() 
	 {
	     click(SpecialOffercheckBox);
	 }
	
	 
	 
	 public void enterFirstName(String firstName) 
	 {
	     type(this.firstName, firstName);
	 }
	
	 public void enterLastName(String lastName)
	 {
	     type(this.lastName, lastName);
	 }
	
	 public void enterCompany(String company) 
	 {
	     type(companyName, company);
	 }
	
	 public void enterAddress1(String address) 
	 {
	     type(this.address, address);
	 }
	
	 public void selectCountry(String country) 
	 {
	     selectDropDown(this.country, country);
	 }
	
	 public void enterState(String state) 
	 {
	     type(this.state, state);
	 }
	
	 public void enterCity(String city) 
	 {
	     type(this.city, city);
	 }
	
	 public void enterZipCode(String zipcode) 
	 {
	     type(this.zipcode, zipcode);
	 }
	
	 public void enterMobileNo(String mobileNo) 
	 {
	     type(mobileNumber, mobileNo);
	 }
	
	 public void selectTitle(String title) 
	 {
	     By titleLoc = By.xpath("//input[@name='title' and @value='" + title + "']");
	     click(titleLoc);
	 }
	 
	 
	 
	 public void clickCreateAcc() 
	 {
	     click(createAccountButton);
	 }
	
	 public boolean isEnterAccInfo() 
	 {
	     try {
	         return findElement(AccountInfoTitle).isDisplayed();
	     } catch (Exception e) {
	         return false;
	     }
	 }
	
	
}
