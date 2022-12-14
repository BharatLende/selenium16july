package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_DropDowm {

	public ListBox_DropDowm() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//1.Identify list box to be handle and store in referance variable.
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));  
		
		//2. Create an object of select class which will accept webelement as argument.
		
		Select s=new Select(dropDown);
		
		//3.By using one of the select class methods we can select values from list box like
		
		//1. selectByVisibleText: selectByVisibleText(string arg0)
		//2. selectByIndex: selectByIndex(int arg0)
		//3. selectByValue: selectByValue: selectByValue(String arg0)
		
		//s.selectByVisibleText("Option2");//Capital 'O'
		//Thread.sleep(2000);
		
		//s.selectByIndex(3);
		//Thread.sleep(100);
		
		s.selectByValue("option1");  // Value so Small 'o'
		
	}

}
