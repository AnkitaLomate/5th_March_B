package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Application\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().minimize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,2000)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(10,100)");
	
	}

}
