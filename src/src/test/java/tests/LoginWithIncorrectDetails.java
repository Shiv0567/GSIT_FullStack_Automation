package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.HomePage;
import pages.SignUpLoginPage;

public class LoginWithIncorrectDetails extends BaseTest



{
	
	@Test
	@Parameters({"loginEmail","loginPassword"})
	public void testLoginWithIncorrectdData(String loginmail, String loginpassword )
	{
		
		WebDriver driver = DriverManager.getDriver();
		
		
		 logger.info("TESTCASE 3 : LOGIN USER WITH INCORRECT EMAIL AND PASSWORD");
		
		
	    HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.homePageIsDisplayed(),  "Expected Home Page to be visible but it is not");
		logger.info("Home Page is displayed successfully");
		
		
	    homePage.clickSignUpORLogin();
	    logger.info("Navigated to Signup/Login page");
	    
	    
	    
	    SignUpLoginPage loginPage = new SignUpLoginPage(driver);
	    Assert.assertTrue(loginPage.isLogin(), "Expected login section to be visible but it is not");
	    logger.info("Login section is visible");
	    
		loginPage.enterEmail(loginmail);
		loginPage.enterPassword(loginpassword);
		loginPage.clickOnLoginButton();
		logger.info("fill details and clicked on login button");
		
		Assert.assertTrue(loginPage.isLoginErr(),"Expectd to show 'email or password is incorrect',but it is not");
		
	}


	
	
	
	
	
}
