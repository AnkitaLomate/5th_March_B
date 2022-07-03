package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void myTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  driver.manage().window().maximize();
	  
	  WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
	  
//	  if(checkbox1.isSelected())
//	  {
//		  Reporter.log("TC is passed",true);
//	  }
//	  else
//	  {
//		  Reporter.log("TC is failed", true);
//	  }
	  checkbox1.click();
	  Thread.sleep(1000);
	  Assert.assertTrue(checkbox1.isSelected(),"CheckBox is not Selected TC is fail");
	  Reporter.log("CheckBx is selected TC is Passed", true);
  }
}
