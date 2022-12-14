package TesrNG_VarificationUsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void verifyCheckboxStatus() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		
//		if(checkbox.isSelected())
//		{
//			Reporter.log("Checkbox is selected Tc is passed",true);
//		}
//		else
//		{
//			Reporter.log("Checkbox is not  selected Tc is fail",true);
//		}
		
		//To reduced the programm we use Assert class
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected(),"Tc fail if check box is not selected");
  }
}
