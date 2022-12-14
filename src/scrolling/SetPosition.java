package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//getting default position
		
		Point defaultPosition= driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		
		//to set position ,we need to create object of point class and pass x and y values
		
		Point p =new Point(57,10);
		
		
		//using point class object use method setPosition
		
		driver.manage().window().setPosition(p);
		
	}

}
//complete