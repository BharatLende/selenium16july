package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void testing()
  {
	  boolean a=true;
	  
	  Assert.assertFalse(a,"a is true Tc is failed");
  }
}
