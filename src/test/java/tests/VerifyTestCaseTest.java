package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.HomePage;
import pages.TestCasesPages;

public class VerifyTestCaseTest extends BaseTest


{
	
	
	@Test
	public void testTestCases()
	{
		
        WebDriver driverRef = DriverManager.getDriver();
        
        logger.info("TESTCASE 7 : VERIFY TESTCASE PAGE");
        
      
        HomePage homePage = new HomePage(driverRef);
        Assert.assertTrue(homePage.homePageIsDisplayed(), "Expected Home Page to be visible but it is not.");
        logger.info("Home Page is displayed successfully");  
        homePage.clickOnTestCase();
        logger.info("Navigated to Test Case page");
        TestCasesPages testCase = new TestCasesPages(driverRef);
        Assert.assertTrue(testCase.isTestCasePage() && testCase.isTestCasePage(),
        				"Expected Test case page should be visible, but it is not");
        logger.info("Test Case Page is displayed successfully");

	}

}
