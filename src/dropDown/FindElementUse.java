package dropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUse {

	public FindElementUse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//how many links are there in webpage
		
	   	List<WebElement> links = driver.findElements(By.tagName("a"));
	  	System.out.println(links.size());
	  	
	  	//what are these links for that use loops 
	  	
	  	Iterator<WebElement> it = links.iterator();
	  	while(it.hasNext())
	  	{
	  		System.out.println(it.next().getText());
	  		
//Output-->get all the name which are present on google page
	  		
	  		//complete
	  	}
	}

}
