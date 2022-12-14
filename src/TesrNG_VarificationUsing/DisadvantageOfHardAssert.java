package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantageOfHardAssert {
  @Test
  public void testing()
  {
	  String a="Pune";
	  String b=null;
	  
	  // if both are not equal and b is not null then Tc should is pass.
	  
	  Assert.assertNotEquals(a,b,"a and b are equals Tc is failed");
	  Assert.assertNotNull(b,"b is null Tc is failed ");
  }
  
  @Test
  public void testing1()
  {
	  String a="pune";
	  String b="pune";
	  
	  // if both are equal and b is null then Tc should is pass.
	  
	  Assert.assertNotEquals(a,b,"a and b are not equals Tc is passed");
	  Assert.assertNotNull(b,"b is not null Tc is passed ");
  }
}
