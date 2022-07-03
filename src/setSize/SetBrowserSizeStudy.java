package setSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSizeStudy {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "E:\\Application\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nobroker.in/");
		System.out.println(driver.manage().window().getSize());
		//To set size-->use Dimension class and create object of Dimension class
		
		Dimension d=new Dimension(1000, 100);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		Dimension d1=new Dimension(1000, 1000);
		driver.manage().window().setSize(d1);

	}

}
