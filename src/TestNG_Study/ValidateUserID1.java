package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID1 
{
  @Test
  public void h() 
  {
	  Reporter.log("User ID Validate", true);
  }
  @BeforeMethod
  public void loinToUpstox()
  {
	  Reporter.log("Login Success...",true);
  }
  @AfterMethod
  public void logOutUpstox()
  {
	  Reporter.log("Log out ", true);
  }
  @BeforeClass
  public void launchingBrowser()
  {
	  Reporter.log("Launch the Browser",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
  }
}
