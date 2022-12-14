package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectListBox {

	public MultiselectListBox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(dropdown);
		
		s.selectByValue("option1");
		Thread.sleep(1000);
		s.selectByValue("option2");
		Thread.sleep(1000);
		s.selectByValue("option3");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		System.out.println("Multiple selectable status is "+s.isMultiple());
		
		//complete
		
	}

}
