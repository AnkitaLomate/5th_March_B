package pom1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteLoginPage login=new KiteLoginPage(driver);
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KitePinPage pin=new KitePinPage(driver);
		pin.SendPin();
		pin.clickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage home=new KiteHomePage(driver);
		home.validateUserID();
		home.clickOnLogoutButton();
		driver.close();
	
		

	}

}
