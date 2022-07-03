package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement TextBox = driver.findElement(By.id("displayed-text"));
		boolean Result = TextBox.isDisplayed();
		System.out.println("Text Box status is "+Result);
		TextBox.sendKeys("Hi GM");
		
		driver.findElement(By.id("hide-textbox")).click();
		
		boolean Result1 = TextBox.isDisplayed();
		System.out.println("Text Box status is "+Result1);
		

	}

}
