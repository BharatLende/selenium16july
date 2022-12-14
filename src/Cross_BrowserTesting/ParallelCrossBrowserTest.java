package Cross_BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelCrossBrowserTest
{
	WebDriver driver;
	@Parameters("browserName")
  @Test
  public void browserTest(String bname)
  {
		if(bname.equals("chrome"))
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
  
	//else if(bname.equals("edge"))
	{
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	    
		 driver.get("https://paytm.com");
		 driver.manage().window().maximize();
}
}
