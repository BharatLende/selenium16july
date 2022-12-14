package Cross_BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CB {
  @Test
  public void CBT()
  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\msedgedriver.exe");

		 WebDriver driver=new EdgeDriver();
		 driver.get("https://paytm.com");
		 driver.manage().window().maximize();
  }
}
