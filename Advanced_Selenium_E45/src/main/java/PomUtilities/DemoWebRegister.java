package PomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebRegister {
	
	//initialize
	public DemoWebRegister(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpwd;
	
	@FindBy(id="register-button")
	WebElement registerbutton;
	
	//actions
	public void firstname(String value)
	{
		firstname.sendKeys(value);
	}
	public void lastname(String value)
	{
		lastname.sendKeys(value);
	}
	public void email(String value)
	{
		email.sendKeys(value);
	}
	public void password(String value)
	{
		password.sendKeys(value);
	}
	public void confirmpwd(String value)
	{
		confirmpwd.sendKeys(value);
	}
	public void registerbutton()
	{
		registerbutton.click();
	}
	
	

}
