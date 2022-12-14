package sendKeysAndClickStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClick_byUsingActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://vctcpune.com/selenium/practice.html");
	   // commonlyMethodUse.waitmethod(driver);
	    
	    //jav script using sendKeys
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    driver.findElement(By.id("autocomplete"));
	 //   commomlyMethodUse.scrollIntoView(driver,entername);
	    //js.executeScript("argument[]0".value='Bharat'",entername);"
	  //  commonlyMethodUse.waitmethod(driver);
	    
	    //Jacascript using click
	    
	    //clicloncheckbox=driver.findElement(By.id("checkBoxOption1"));
	    
	   // problem
	}

}
