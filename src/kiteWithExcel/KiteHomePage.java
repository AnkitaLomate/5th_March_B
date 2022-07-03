package kiteWithExcel;

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
	
	public String getActualUserID()
	{
		String actualUserID = userID.getText();
		return actualUserID;
	}
//	public void validateUserID(String expectedusername)
//	{
//		String actualUserID=userID.getText();
//	    String expectedUserID=expectedusername;
//	
//	
//	if(actualUserID.equals(expectedUserID))
//	{
//		System.out.println("User Id is matching TC is Passed");
//	}
//	
//	else {
//		System.out.println("UserId not matching TC is Failed");
//	}
//	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		
		userID.click();
		Thread.sleep(200);
		LogoutButton.click();
		
	}
	
	}


