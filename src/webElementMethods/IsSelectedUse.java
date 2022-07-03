package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Application\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		WebElement CheckBox = driver.findElement(By.id("checkBoxOption1"));
		boolean Result = CheckBox.isSelected();
		System.out.println("Checkbox is "+Result);
		
		if(CheckBox.isSelected()) {
			System.out.println("CheckBox is already selected");
		}
		else {
			System.out.println("Selecting CheckBox now");
			CheckBox.click();
			
			if(CheckBox.isSelected()) {
				System.out.println("Check Box is selected now");
			}
			else {
				System.out.println("Failed to select check box");
			}
		}
		
	}

}
