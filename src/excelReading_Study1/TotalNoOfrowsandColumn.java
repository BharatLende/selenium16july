package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalNoOfrowsandColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile =new File("C:\\Users\\user\\Desktop\\ExcelReading.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		int lastRowNum=mysheet.getLastRowNum();
		System.out.println("last row Num is "+lastRowNum);
		
		int totalRowNum=lastRowNum;
		System.out.println("Total Num of Row is "+totalRowNum);
		
		int lastCellNum=mysheet.getRow(0).getLastCellNum();
		System.out.println("Last cell num is "+lastCellNum);
		
		int totalNumCell=lastCellNum-1;
		System.out.println("total Num of cell "+totalNumCell);
		for(int i=0;i<=totalRowNum;i++)
		{
			for(int j=0;j<=totalNumCell;j++)
			{
				System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}

	}

}
