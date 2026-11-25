package NinjaCRMFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		//step=1 create object of java representation
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		
		//step=2 load all the keys
		Properties p=new Properties();
		p.load(fis);
		
		//step =3 read the data
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
	}

}
