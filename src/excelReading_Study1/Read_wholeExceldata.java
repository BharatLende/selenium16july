package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_wholeExceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\user\\Desktop\\ExcelReading.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		//How To read read whole excel data.......used for loop
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String allExcelData = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(allExcelData+" ");
			}
			System.out.println();
		}

	}

}
