package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView1 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Application\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nobroker.in/");
		Thread.sleep(1000);
		WebElement Text = driver.findElement(By.xpath("//div[text()='NoBroker services']"));
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("arguments[0].scrollIntoView(true);",Text);
	}

}
