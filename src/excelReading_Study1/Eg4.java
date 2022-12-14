package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		//how to read whole data from excel

	    //vary Rows------vary cell
		//outer for loop-->rows-->vary 0-->1
		
		for(int i=0;i<=1;i++)
		{
			for(int j=1;j<=3;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
