package dropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList {

	public UnOrderList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//how many option on that webpage
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(1000);
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='mkHrUc']"));
		
		System.out.println("No of option "+results.size());//sise method is use returns number of element present in webElement 
		
		//what are these option 
		//Iterator<WebElement> r = results.iterator(); 
		//while(r.hasNext())
		//{
			//System.out.println(r.next());//this method return the next element
		//}
		for(WebElement r1:results)
		{
			System.out.println(r1.getText());
		
			
			String expected="honda city";
			String actual=r1.getText();
			
			//if(expected.equals(actual)
					{
				r1.click();
				break;
				
				//complete
			}
		}
		

	}

	
}
