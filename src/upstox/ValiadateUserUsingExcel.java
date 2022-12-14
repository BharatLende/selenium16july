package upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValiadateUserUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		File myfile =new File("C:\\Users\\user\\Download\\16julyEvA.xlsx");
		
	 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	 
	String un = mysheet.getRow(0).getCell(0).getStringCellValue();
	
	WebElement userId = driver.findElement(By.name("userId"));
	userId.sendKeys(un);
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys(mysheet.getRow(0).getCell(1).getStringCellValue());
	
	driver.findElement(By.id(""));
	
	Thread.sleep(1000);
	WebElement birthyear = driver.findElement(By.id("yob"));
	
	birthyear.sendKeys(mysheet.getRow(0).getCell(2).getStringCellValue());
	
	Thread.sleep(1000);
	
	String actualUN = driver.findElement(By.xpath("")).getText();

	String expectedUn="Bharat L";
	
	if(actualUN.equals(expectedUn))
	{
		System.out.println("Username matching Tc is passed");
	}
		else
		{
	
			System.out.println("User name not matching TC is fail");
		}
	}
	

		
	}


