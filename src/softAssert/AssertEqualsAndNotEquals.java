package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals {
	
	SoftAssert soft=new SoftAssert();
	
  @Test
  public void myMethod() 
  {
	  String a="Ankita";
	 // String b="Ankita";
	  String c="Lomate";
	  
	  soft.assertEquals(a, c,"Both are not equal TC is failed");
	  soft.assertAll();
	  
	  soft.assertNotEquals(a, c,"Both are equals TC is failed");
	  soft.assertAll();
  }
  
  @Test
  public void myMethod1()
  
  {
	  boolean a=true;
	  
	  soft.assertTrue(a, "a is not true TC is failed");
	  soft.assertAll();
	  
	  
  }
  
}
