package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "E:\\Application\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
