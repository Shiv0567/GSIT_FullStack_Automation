package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUpLoginPage  extends BasePage  
{  
	
	
	
    By loginPageHeading = By.xpath("//h2[text()='Login to your account']");
	By emailAddress = By.xpath("//input[@placeholder='Email Address' and @data-qa='login-email']");
	By password = By.xpath("//input[@placeholder='Password' and @data-qa='login-password']");
	By loginButton = By.xpath("//button[@class='btn btn-default' and @data-qa='login-button']");
	By username = By.xpath("//input[@data-qa='signup-name']");
	By newEmailAddress = By.xpath("//input[@data-qa='signup-email' and @placeholder='Email Address']");
	By signUpButton = By.xpath("//button[@data-qa='signup-button']");
	By newSignUp = By.xpath("//h2[text()='New User Signup!']");
	By signup = By.xpath("//form[@action='/signup']//p[text()='Email Address already exist!']");
	By login = By.xpath("//form[@action='/login']//p[text()='Your email or password is incorrect!']");
	 
	

	

	public SignUpLoginPage(WebDriver driver) 
	
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
		 public boolean isLogin() 
		 {
		     return isElementVisible(login);
		 }
		
		
		 public void enterEmail(String username) 
		 {
		     type(emailAddress, username);
		 }
		
		 
		 public void enterPassword(String password) 
		 {
		     type(this.password, password);
		 }
		
		 
		 public void clickOnLoginButton() 
		 {
		     click(loginButton);
		 }
		
		
		 public String getLoginPageTitle() 
		 {
		     return driver.getTitle();
		 }
		
		
		 public boolean isLoginErr() 
		 {
		     return isElementVisible(login);
		 }
		
	
		 public boolean isSignup() 
		 {
		     return isElementVisible(newSignUp);
		 }
		
		
		 public void enterUsername(String username) 
		 {
		     type(this.username, username);
		 }
		
		 
		 public void enterEmailAddress(String email) 
		 {
		     type(emailAddress, email);
		 }
		
		 
		 public void clickOnSignUpButton() 
		 {
		     click(signUpButton);
		 }
		
		 
		 public boolean isSignupError() 
		 {
		     return isElementVisible(signup);
		 }
	
	
	
	

}
