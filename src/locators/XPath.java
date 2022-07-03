package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[@value='Radio4']")).click();//using attribute
		//driver.findElement(By.xpath("//a[text()='Contact Us']")).click();//using text method
		//driver.findElement(By.xpath("//a[contains(text(),' Training Center')]")).click();//using contains text method
		//driver.findElement(By.xpath("//input[contains(@id,'hide')]")).click();//using contains attribute method

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}


