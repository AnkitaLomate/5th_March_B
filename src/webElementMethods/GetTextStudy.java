package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(100);
        WebElement Element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
        Thread.sleep(10000);
        System.out.println(Element.getText());
        String MyText = Element.getText();
        System.out.println(MyText);
        
        String ActualText = Element.getText();
        String ExpectedText = "facebook helps you connect and share with the people in your life.";
        if(ActualText.contentEquals(ExpectedText))
        		{
        	System.out.println("Text is Matching and TC is passed");
        		}
        else {
        	System.out.println("Text is not Matching and TC is failed");
        }
        
	}
	

}
