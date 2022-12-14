package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
        System.out.println("=================================");
        
        //how to read whole row from excel
        
        for(int i=0;i<=2;i++)
        {
        	String value1 = mysheet.getRow(2).getCell(i).getStringCellValue();
        	System.out.print(value1+" ");  	
        }
        System.out.println();
        
       System.out.println("=================================");
       
       //how read whole column from excel
       for(int i=1;i<=3;i++)
       {
       
       Object value2 = mysheet.getRow(i).getCell(2).getStringCellValue();
       System.out.println(value2);
	}

       //complete
}
}