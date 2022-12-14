package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg2 {

	public TableEg2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//i need to pickup rows---2 to 11
		
		for(int i=2;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
			
		     String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
			
		     System.out.print(text+" ");
		     
			}
			System.out.println();
		}
		
	}

}
