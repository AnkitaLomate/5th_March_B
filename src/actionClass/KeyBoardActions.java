package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement TextBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		//TextBox.sendKeys("Velocity");
		
		Actions act=new Actions(driver);
		
		//act.sendKeys(TextBox, "pune").perform();
		
		act.keyDown(TextBox, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
		
		
		

	}

}
