package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
File myfile = new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
String value1=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	   
	System.out.println(value1);
	
	//write down Numeric value in excel sheet
	   
double value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();

   System.out.println(value2);
   
  // boolean value means in excel sheet write down true or faulse 
    
    boolean value3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();

    System.out.println(value3);
	}
	
	//complete
	
	

}
