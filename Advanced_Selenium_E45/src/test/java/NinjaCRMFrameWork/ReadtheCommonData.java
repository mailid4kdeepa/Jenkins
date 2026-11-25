package NinjaCRMFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadtheCommonData {
	public static void main(String[] args) throws IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		
		
		Properties p=new Properties();
		p.load(fis);
		
	
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		WebDriver driver=null;
		//edge i have some version issue
		if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		driver.findElement(By.id("username")).sendKeys("USERNAME");
		driver.findElement(By.id("inputPassword")).sendKeys("PASSWORD");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	}

}
