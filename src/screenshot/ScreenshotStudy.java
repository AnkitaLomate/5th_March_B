package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotStudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		//to take screenshot using selenium webdriver,we need to type cast driver object to TakesScreenshot interface
		//Then we need to call function getscreenshotAs();there we need to pass the argument
		//Outputtype.FILE
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\USER\\Pictures\\Screenshots\\myscreenshot.png");
		FileHandler.copy(src, dest);
		

	}

}
