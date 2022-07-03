package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1.Data Members
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;
	
	//2.Constructor
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Methods
	public void validateUserID()
	{
		String actualUserID=userID.getText();
	    String expectedUserID="ELR328";
	
	
	if(actualUserID.equals(expectedUserID))
	{
		System.out.println("User Id is matching TC is Passed");
	}
	
	else {
		System.out.println("UserId not matching TC is Failed");
	}}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		
		userID.click();
		Thread.sleep(200);
		LogoutButton.click();
		
	}
	
	}


