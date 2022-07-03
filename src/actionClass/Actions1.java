package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		//Move to element using mouse actions
		
		Actions act=new Actions(driver);
		
		WebElement MyElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		act.moveToElement(MyElement).perform();
		
		//click using mouse actions
		
		WebElement testElement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		
		//1st way
		
		//act.moveToElement(testElement).perform();
		//act.click().perform();
		
		//2nd way
		
		//act.moveToElement(testElement).click().build().perform();
		
		//3rd way
		
		//act.click(testElement).perform();
		
		//right click-->context click
		
		//act.moveToElement(testElement).contextClick().build().perform();
		
		act.contextClick(testElement).perform();
		
		
		

	}

}
