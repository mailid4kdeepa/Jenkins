package PomImplementation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtilities.DemoWebHomePage;
import PomUtilities.DemoWebRegister;

public class DemoWebImplementation {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		DemoWebHomePage dh= new DemoWebHomePage(driver);
		dh.searchtf("shoes");
		
		Thread.sleep(3000);
		dh.submit();
		dh.register();
		
		DemoWebRegister dr=new DemoWebRegister(driver);
		dr.firstname("Deepa");
		dr.lastname("Karthik");
		dr.email("deepa@gmail.com");
		dr.password("df@456789");
		dr.confirmpwd("df@456789");
		 Thread.sleep(3000);
		 
		 dr.registerbutton();
		
		
				
	}

}
