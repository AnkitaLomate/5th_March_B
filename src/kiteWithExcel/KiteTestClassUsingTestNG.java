package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClassUsingTestNG {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	Sheet mySheet;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching URL",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new KiteLoginPage(driver);
		home=new KiteHomePage(driver);
		pin=new KitePinPage(driver);
		File MyFile=new File("E:\\5th_March_B\\Excel Worksheet.xlsx");
		mySheet=WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
	}
	
	@BeforeMethod
	public void loginToKite()
	{
		login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending Username",true);
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending Password",true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		pin.SendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending Pin",true);
		pin.clickOnContinueButton();
		Reporter.log("Clicking on continue button",true);
	}
	
  @Test
  public void verifyKiteUserName() 
  {
	  //Expected username-->excel
	  //Actual username-->??
	  
	  String expectedUserID=mySheet.getRow(0).getCell(0).getStringCellValue();
	  
	  String actualUserID=home.getActualUserID();
	  
	  Reporter.log("Validating user ID",true);
	  
	  Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is Failed");
	 
	  Reporter.log("Expected UserID and Actual UserID are matching TC is Passed",true);
  }
  
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("Logging out....",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing browser",true);
	  
	  driver.close();
  }
}
