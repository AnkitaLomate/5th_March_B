package dropdownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		
		Thread.sleep(2000);
		
		//1. Identify list box to be handled and store it in reference variable
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		
		//2. Create an object of select class which will accept WebElement as argument
		
		Select s=new Select(day);
		Select s1=new Select(month);
		
		//3. By using one of the select class methods we can select values
				//i. selectByVisibleText:selectByVisibleText(String arg0)
				//ii. selectByIndex:selectByIndex(int arg0)
				//iii. selectByValue:selectByValue(String arg0)
		
//		s.selectByVisibleText("5");
//		s.selectByValue("20");
//		s.selectByIndex(24);
//		
		s1.selectByVisibleText("Sep");
		s1.selectByIndex(0);
		s1.selectByValue("12");
	}

}
