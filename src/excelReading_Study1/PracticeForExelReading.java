package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeForExelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	 File myfile =new File("C:\\Users\\user\\Desktop\\ExcelReading.xlsx");
	 
	 boolean value1= WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
	 System.out.println(value1);
	 
	 String value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	 System.out.println(value2);
	 
	double value3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
	 System.out.println(value3);
	}

}
