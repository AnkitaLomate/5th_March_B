package selenium_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Application\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println("title is " +driver.getTitle());
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("url is "+ driver.getCurrentUrl());
		
		
		
		

	}

	
}

