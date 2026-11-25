package UsingTestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class DataFromXml {
	@Parameters({"UN", "PWD"})
	@Test
	public void m1(@Optional("admin") String UN,@Optional("admin123") String PWD)
	{
		System.out.println("UN:"+UN);
		System.out.println("PWD:"+PWD);
	}
	
	@Test
	public void m2(XmlTest test)
	{
		System.out.println("UN:"+test.getParameter("PWD"));
		System.out.println("pwd:"+test.getParameter("pwd"));
	}

}
