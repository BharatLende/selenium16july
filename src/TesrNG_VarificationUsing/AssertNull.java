package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void testing()
  {
	  String a="";
	  
	  //if String is Null then Tc is Pass
	  
	  Assert.assertNull(a,"a is not Null then tc is fail");
  }
  @Test
  public void testing1()
  {
	  String b="Null";
	  
	  Assert.assertNull(b,"b is not null then Tc fail");
  }
}
