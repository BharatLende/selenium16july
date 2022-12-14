package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg3 {
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//i need to pickup rows---varying from 1 to 11
		
		for(int i=1;i<=11;i++)
		{ 
			//now pickup column from perticilar row---varying
			
			for(int j=1;j<=3;j++)
			{
			
				if(i==1)
				{	
				
		     String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText();
			
		     System.out.print(text+" ");
	        }
			else
			{
			
				String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
			
				System.out.print(text+" ");
			
			}
	
		}
			System.out.println();
}
}
}