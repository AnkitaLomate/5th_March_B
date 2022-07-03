package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9373237653");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9923090222");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//driver.get("https://www.instagram.com/?hl=en");
		//Thread.sleep(100);
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ankii_sanket_kardile");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9923090222");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}


