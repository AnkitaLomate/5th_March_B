package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test
  public void KiteLogin() 
  {
	 System.setProperty("webdriver.chrome.driver","E:\\Application\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://kite.zerodha.com/");
	 
	 System.out.println("KiteLoginPage is running");
	  
  }
  
  @Test
  public void vctcPracticePage() 
  {
	 System.setProperty("webdriver.chrome.driver","E:\\Application\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 
	 Reporter.log("vctcPracticePage method is running");
	  
  }
  
  @Test
  public void FacebookLoginPage() 
  {
	 System.setProperty("webdriver.chrome.driver","E:\\Application\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/login/");
	 
	 Reporter.log("FacebookLoginPage method is running", true);
	  
  }
}
