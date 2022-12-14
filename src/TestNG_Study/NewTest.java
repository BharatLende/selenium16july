package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest 
{
  @Test
  public void f() 
  {
	  Reporter.log("this is my f method is running", true);
  }
}
