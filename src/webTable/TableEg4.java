package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg4 {

	public TableEg4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
	    for(WebElement t:table)
	    {
	    	System.out.print(t.getText()+" ");
	    	System.out.println();
	    }
		
	}

}
