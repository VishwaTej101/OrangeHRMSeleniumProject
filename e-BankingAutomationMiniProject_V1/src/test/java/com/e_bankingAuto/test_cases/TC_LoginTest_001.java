package com.e_bankingAuto.test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.e_bankingAuto.pageObjectGroup.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	
	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();

if(driver.getTitle().equals("LOGIN Panel")) {
	
	Assert.assertTrue(true);
	
}
else {
	Assert.assertTrue(false); 
}
	}

}
