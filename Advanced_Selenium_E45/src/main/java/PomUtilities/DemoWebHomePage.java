package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebHomePage {
	
	//no need to create main method b'cause here just we are storing
	
	//initialize
	public DemoWebHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declare
	@FindBy(id="small-searchterms")
	WebElement searchtf;
	
	@FindBy(css="[type='submit']")
	WebElement searchbutton;
	
	@FindBy(linkText = "Register")
	WebElement register;
	
	public void searchtf(String value)
	{
		searchtf.sendKeys(value);
	}
	
	public void submit()
	{
		searchbutton.click();
	}
	
	public void register()
	{
		register.click();
	}
	

}
