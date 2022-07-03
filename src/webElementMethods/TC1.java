package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(100);
       WebElement Ele = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
	   String ActualText = Ele.getText();
	   String ExpectedText = "VELOCITY CORPORATE TRAINING CENTER";
	   
	  if( ActualText.equals(ExpectedText))
	  {
		  System.out.println("Text is matching TC is passed");
	  }
	  else {
		  System.out.println("Text is not matching TC is failed");
	  }
	}

}

