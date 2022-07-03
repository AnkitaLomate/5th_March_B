package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void myMethod()
  {
	 // boolean a=true;
	  boolean b=false;
	  
//	  Assert.assertTrue(a, "value is false TC is Failed");
//	  Reporter.log("Value is true TC is Passed", true);
	  
	  Assert.assertFalse(b, "Value is True TC is Failed");
	  Reporter.log("Value is false TC is passed", true);
	  
	  
	  
  }
}
