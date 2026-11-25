package UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicOfTestingTest {
	
	
	@Test(groups = "smoketesting")
	
	public void logintest()
	{
	
		Reporter.log("login",true);
	}
	
	@Test(groups = "smoketesting")
	
	public void registertest()
	{
		
		Reporter.log("register",true);
	}
	
	@Test(groups = "regressiontest")
	public void addtocarttest()
	{
		Reporter.log("addtocart",true);
	}
	
	
	@Test(groups = "regressiontest")
	public void wishlisttest()
	{
		Reporter.log("wishlist",true);
	}	
	
	
	

}
