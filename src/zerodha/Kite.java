package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		WebElement UN = driver.findElement(By.id("userid"));
		WebElement PSW = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UN.sendKeys("CH2584");
		PSW.sendKeys("S@nket7418");
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("160821");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserID = userID.getText();
		String expectedUserID = "ELR321";
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID is matching TC is passed");
		}
		else {
			System.out.println("User ID is not matching TC is failed");
		}
		
		userID.click();
		Thread.sleep(1000);
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		Thread.sleep(1000);
		driver.close();
		
	
	
	}

}
