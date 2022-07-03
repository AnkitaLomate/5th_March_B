package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classmateshop.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Login/Sign Up']")).click();
		
		Thread.sleep(4000);
		
		WebElement ContinueButton = driver.findElement(By.xpath("//span[text()='Continue']"));
		ContinueButton.clear();
		boolean Result = ContinueButton.isEnabled();
		
		System.out.println("Continue Button status is "+Result);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys("9999999999");
		Thread.sleep(3000);

		boolean Result1 = ContinueButton.isEnabled();
		System.out.println("Continue Button status is "+Result1);
		
		
		
		
		
	}
	}



