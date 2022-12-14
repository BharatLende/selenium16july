package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//how many rows in table(tr)
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("Total no rows is "+rows.size());
		
		//specific data from row and column
		
		String SpecificData = driver.findElement(By.xpath("//table[@id='product']//tr[4]//td[2]")).getText();
		System.out.println("Specific data is "+SpecificData);
		
		//WebElement rows10 = driver.findElement(By.xpath("//table[@id='product']//tr[10]//td"));
		
		Iterator<WebElement> it = rows.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
			System.out.println();
		}
		
		
		
	}
	

}
