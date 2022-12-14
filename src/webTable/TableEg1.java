package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//how many rows in table(tr)
		
		List<WebElement> Totalrows = driver.findElements(By.xpath("//table[@id='product']//tr"));	
		
		System.out.println("Total rows is "+Totalrows.size());
		
		//how many column in table(th)
		
       // List<WebElement> TotalColumn = driver.findElements(By.xpath("//table[@id='product']//th"));	
		
		//System.out.println("Total column is "+TotalColumn.size());
		
		                       //   OR  To find out how many column in table.
		
		 List<WebElement> TotalColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		
		System.out.println("Total columns is "+TotalColumns.size());
		
		//How to read specific data
		
	    String specificData = driver.findElement(By.xpath("//table[@id='product']//tr[4]//td[2]")).getText();
		
		System.out.println("My data is "+specificData);
		System.out.println("======================");
		
		//how to Read whole rows using 'findElements' Method
		//Means 10th rows all data
		
		List<WebElement> row10 = driver.findElements(By.xpath("//table[@id='product']//tr[10]//td"));
		
		Iterator<WebElement> it = row10.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
			
			System.out.println();
		
		}
		
		//how to read whole row using 'findElement' Method
         for(int i=1;i<=3;i++)
         {
        	 String Text = driver.findElement(By.xpath("//table[@id='product']//tr[10]//td["+i+"]")).getText();
             
        	 System.out.println(Text+" ");
         
         }
         
	}

}
