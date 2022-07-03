package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy1 {
  @Test
  public void myTest() 
  {
	  Reporter.log("Test method is running", true);
  }
  
  @Test
  public void myTest1()
  {
	  Reporter.log("Test method1 is running", true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Before method is running", true);
  }
  
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("After method is running", true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Before class is running", true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("After class is running", true);
  }
}
