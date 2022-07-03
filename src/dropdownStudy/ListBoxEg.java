package dropdownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(2000);
		
		//1. Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.name("birthday_day"));
		Thread.sleep(1000);
		
		//2. Create an object of select class which will accept WebElement as argument
		
		Select s=new Select(day);
		
		//3. By using one of the select class methods we can select values
		//i. selectByVisibleText:selectByVisibleText(String arg0)
		//ii. selectByIndex:selectByIndex(int arg0)
		//iii. selectByValue:selectByValue(String arg0)
		Thread.sleep(1000);
		s.selectByVisibleText("8");
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("21");
		
		//1.
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		//2.
		Select s1=new Select(month);
		//3.
		s1.selectByIndex(0);
		Thread.sleep(1000);
		
		s1.selectByValue("9");
		Thread.sleep(1000);
		
		s1.selectByVisibleText("Mar");
		
		
		
		
		
	}

}
