package NinjaCRMFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1;
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CreateCampaign.xlsx");
		
		//step 2:
	
		 Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet("sheet1");
		  
		  Row row = sh.getRow(1);
		  
		  Cell cell = row.getCell(3);
		  String data = cell.getStringCellValue();
		  System.out.println(data);
		  wb.close();
		  
		
	}

}
