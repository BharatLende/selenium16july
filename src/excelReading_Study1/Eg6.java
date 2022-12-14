package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
File myfile=new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		int totalNuOfRows = mysheet.getLastRowNum();
		System.out.println("total Num of rows is "+totalNuOfRows);
		
		int totalNoOfCells = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total num of cell is "+totalNoOfCells);
		
		//outer loop for ---rows
		
		for(int i=0;i<=totalNuOfRows;i++)
		{
			//inner for loop
			
			for(int j=0;j<=totalNoOfCells;j++)
			{
				System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		

	}

}
