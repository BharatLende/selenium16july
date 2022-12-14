package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.discoveryplus.in/");
	    driver.manage().window().maximize();
	    Wait<WebDriver> wait= new FluentWait<WebDriver>(driver);
	//    .withTimeout(Duration.ofSeconds(30));
	    //.pollingEvery(Duration.ofSeconds(5));
	  //  .ignoring(NoSuchElementException.class);
	    
	  //  locator=wait.until(ExpectedConditions.visibilityofElementLocated(By.xpath("//h6[text()='Sign In'][2]")));
	    
	  //  locator.click();
	}

}
