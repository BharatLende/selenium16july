package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void testing()
  {
	  boolean a=false;
	  
	  Assert.assertTrue(a,"a is false then Tc is failed");
  }
}
