package dataProvider;

import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import utils.ExcelUtil;

import utils.ExcelUtil;

public class DataProviders
{
	
	
	
	
		@DataProvider(name = "LoginData")
	    public Object[][] getLoginData() {
	        String path = "src\\test\\resources\\testData\\LoginData.xlsx";
	        List<Map<String, String>> list = ExcelUtil.getData(path, "Login");

	        Object[][] data = new Object[list.size()][1]; 
	        for (int i = 0; i < list.size(); i++) {
	            data[i][0] = list.get(i);  
	        }
	        return data;
	    }
		
		
		@DataProvider(name="signupData")
		public Object[][] getSignUpData()
		{
			String path = "src\\test\\resources\\testData\\SignInData.xlsx";
	        List<Map<String, String>> list = ExcelUtil.getData(path, "Signup");

	        Object[][] data = new Object[list.size()][1]; // one Map per test case
	        for (int i = 0; i < list.size(); i++) {
	            data[i][0] = list.get(i);  // put each Map into Object[][]
	        }
	        return data;
			
		}
		
		
		
		
	    @DataProvider(name="contactusData")  
	    public Object[][] getContactData() 
	    {
	            Object[][] data ={
	                {"shreyas", "testtest56@gmail.com", "Regarding Service", "Packing should be improved", ""},
	                {"shivam", "shivam@gmail.com", "PDelivery Delay", "Delivery was delayed by 3 days", ""},
	                {"teste", "tester@gmail.com", "payment issue", "payment failed", ""}
	            };
	            
	            return data;
	    }
	    
	    
	    
	    @DataProvider(name = "searchProducts")
	    public Object[][] getSearchProducts()
	    {
	        return new Object[][] {
	            {"Jeans"},
	            {"Cotton"}
	        };
	    }
		
		

}
