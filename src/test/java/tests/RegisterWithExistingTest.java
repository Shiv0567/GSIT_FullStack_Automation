package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.HomePage;
import pages.SignUpLoginPage;

public class RegisterWithExistingTest extends BaseTest


{
	
	@Test
	@Parameters({"username","Email"})
	public void testWithExistingMail(String username, String mail)
	{
		logger.info("TESTCASE 5 REGISTER USER with Existing mail");

	    WebDriver driver = DriverManager.getDriver();

	  
	    HomePage homePage = new HomePage(driver);
	    Assert.assertTrue(homePage.homePageIsDisplayed(), "Expected Home Page to be visible but it is not");
	    logger.info("Home Page is displayed successfully");

	   
	    homePage.clickSignUpORLogin();
	    logger.info("Navigated to Signup/Login page");

	    
	    SignUpLoginPage loginPage = new SignUpLoginPage(driver);
	    Assert.assertTrue(loginPage.isSignup(), "Expected Signup section to be visible but it is not");
	    logger.info("Signup section is visible");
	    
	    loginPage.enterUsername(username);
	    loginPage.enterEmailAddress(mail);
	    loginPage.clickOnSignUpButton();
	    logger.info("Performed signup with username: {} and email: {}",username, mail);
	    Assert.assertTrue(loginPage.isSignupError(), "Expected duplicate email error message not displayed!");


	
	
	
	}
	
}
