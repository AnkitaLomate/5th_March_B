package selenium_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_1st_Selenium_Program {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.close();
		
		//driver.quit();
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://in.bookmyshow.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
