package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.discoveryplus.in/");
	    driver.manage().window().maximize();
	    
	   // WebDriverWait w= new WebDriverWait(Driver,Duration.ofMillis(8000));
	    //w.until(ExpectedConditions.visibilityofElementLocated(By.xpath("//h6[text()='Sign In'][2]")));
	    //locator.click();
	}

}
