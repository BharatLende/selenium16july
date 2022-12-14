package upStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		File myfile =new File("C:\\Users\\user\\Downloads\\16julyEvA.xlsx");
		
	   org.apache.poi.ss.usermodel.Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	   String un = mySheet.getRow(0).getCell(0).getStringCellValue();
	  String pwd= mySheet.getRow(0).getCell(1).getStringCellValue();
	   
	   
	   //create object of login page
	   
	   loginPage login=new loginPage(driver);
	   login.enterusername(un);
	   login.enterpassword(pwd);
	   login.clickOnSignButton();
}

}
