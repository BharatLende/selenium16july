package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEg1 {

	public ActionClassEg1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Mouse action--> move to Element
		//1. Create a object of action class and pass driver object as a argument
		
		Actions act =new Actions(driver);
		Thread.sleep(1000);
		
		//2. By using one of the action class method perform required actions
		
		WebElement refElement = driver.findElement(By.linkText("SALES"));
		
		act.moveToElement(refElement).perform();
		Thread.sleep(1000);
		
		//mouse action--> click
		WebElement clickMe = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		
		//act.moveToElement(clickMe).perform();
		Thread.sleep(1000);
		//act.click().perform();
		act.moveToElement(clickMe).click().build().perform();
		//act.click().perform();
		
		//Mouse action-->Drag and Drop
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));
		
		// act.moveToElement(source).clickAndHold().release(target).build().perfrom();	
		
		act.dragAndDrop(source, target).perform();
		
		
	//complete
	}

}
