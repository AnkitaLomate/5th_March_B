package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDisable {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		File MyFile=new File("E:\\5th_March_B\\Excel Worksheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		String userName = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		String KitePin = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName(userName);
		login.sendPassword(password);
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KitePinPage pin=new KitePinPage(driver);
		pin.SendPin(KitePin);
		pin.clickOnContinueButton();
		
		
	}

}
