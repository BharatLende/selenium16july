package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {

	private static int k;

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile =new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		int lastRowNum = mysheet.getLastRowNum();
		System.out.println("last Row number is "+lastRowNum);
		
		int totalNoOfRows = lastRowNum;
		System.out.println("Total no of Rows is "+totalNoOfRows);
		
		short lastCellNumber = mysheet.getRow(0).getLastCellNum();
		System.out.println("last cell number is "+lastCellNumber);
		
		int totalNumberCells = lastCellNumber-1;
		System.out.println("Total number of cell "+totalNumberCells);
		
		for(int i=0;i<=totalNoOfRows;i++)
		{
			for(int k=0;k<=totalNumberCells;k++);
			{
			System.out.print(mysheet.getRow(i).getCell(k).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		

	}

}
