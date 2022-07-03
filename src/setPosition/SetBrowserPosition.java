package setPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserPosition {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Application\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().minimize();
		
		driver.get("https://www.nobroker.in/");
		System.out.println(driver.manage().window().getPosition());
		//Thread.sleep(1000);
		//To get Position -->use Point class and Point class object of Point class
		Point p=new Point(100, 10);
		driver.manage().window().setPosition(p);
		
		
		
		
		
			}

}
