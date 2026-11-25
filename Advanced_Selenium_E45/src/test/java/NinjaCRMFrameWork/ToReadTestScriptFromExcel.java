package NinjaCRMFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToReadTestScriptFromExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//To read common data
FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		
		
		Properties p=new Properties();
		p.load(fis);
		
	
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		//to read the test script data
FileInputStream fis1=new FileInputStream("./src/test/resources/TestData/CreateCampaign.xlsx");
		
		//step 2:
	
		 Workbook wb = WorkbookFactory.create(fis1);
		  Sheet sh = wb.getSheet("sheet1");
		  String CAMPAIGNNAME = sh.getRow(1).getCell(2).getStringCellValue();
		  String TARGET_SIZE = sh.getRow(1).getCell(3).getStringCellValue();
		  
		  
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
			
			driver.findElement(By.id("username")).sendKeys(USERNAME);
			driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			
			Thread.sleep(3000);
			
		  driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		  driver.findElement(By.name("campaignName")).sendKeys(CAMPAIGNNAME);
		   WebElement size = driver.findElement(By.name("targetSize"));
		   size.clear();//here target size will be default i mean 0;  integer number should give in execel (') Then only we can retrieve the output from excal...
		   size.sendKeys(TARGET_SIZE);
		   driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		   
		   //for contacts
		   driver.findElement(By.linkText("Contacts")).click();
		   driver.findElement(By.xpath("//span[text()='Create Contact']")).click();
		   driver.findElement(By.name("organizationName")).sendKeys("");
		   
				  
	}

}
