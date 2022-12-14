package excelReading_Study1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelEg2 {

	public excelEg2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File myfile = new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		
		Row myRow = mySheet.getRow(0);
		
		Cell myCell = myRow.getCell(3);
		
		CellType myType = myCell.getCellType();
		
		System.out.println(myType);
		
		String value = myCell.getStringCellValue();
		System.out.println(value);
		
		 
		
	}

}
