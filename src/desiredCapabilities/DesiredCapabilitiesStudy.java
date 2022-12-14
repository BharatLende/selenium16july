package desiredCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitiesStudy {

	public DesiredCapabilitiesStudy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		//Create a object of chrome option
		
			ChromeOptions opt=new ChromeOptions();
				
		//Call method addArgument and add desired option
					
		    opt.addArguments("--disable-notifications");
		    
		    opt.addArguments("disable-infobars");
				
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	
	    driver.get("https://www.justdial.com/");
	    
	    Thread.sleep(5000);
	    
	    String myText = driver.findElement(By.xpath("//span[text()='Popular Services ']")).getText();
	    System.out.println("my text is "+myText);
	}

}
