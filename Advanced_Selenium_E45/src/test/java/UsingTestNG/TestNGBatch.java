package UsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGBatch {
	
@Test(dependsOnMethods = "registertest")
	
	public void logintest()
	{
	
		Reporter.log("login",true);
	}
	
	@Test
	
	public void registertest()
	{
		
		Reporter.log("register",true);
	}
	
	@Test(dependsOnMethods = "wishlisttest")
	public void addtocarttest()
	{
		Reporter.log("addtocart",true);
	}
	
	
	@Test(dependsOnMethods = "registertest")
	public void wishlisttest()
	{
		Reporter.log("wishlist",true);
	}
	
	
	

}



