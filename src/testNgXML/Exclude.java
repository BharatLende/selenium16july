package testNgXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exclude {
  @Test
  public void F()
  {
	  Reporter.log("F method is running",true);
  }
  @Test
  public void G()
  {
	  Reporter.log("G method is running",true);
  }
  @Test
  public void K()
  {
	  Reporter.log("K method is running",true);
  }
}
