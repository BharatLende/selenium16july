package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0.900)");
        // Thread.sleep(1000);
         
         js.executeScript("window.scrollBy(0,-600");
         
         
	}

}

