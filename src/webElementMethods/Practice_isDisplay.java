package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_isDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
				textbox.sendKeys("Good morning");
				
				WebElement hideButton = driver.findElement(By.id("hide-textbox"));
				 WebElement showButton = driver.findElement(By.id("show-textbox"));
				 
				 hideButton.click();
				// showButton.click();
				 
				 if(textbox.isDisplayed())
				 {
					 textbox.sendKeys("Good Night");
				 }
				 else
					{
						System.out.println("text box is not display, plz check");
					}
	}
	

}
