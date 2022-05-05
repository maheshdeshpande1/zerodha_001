package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgot_password 
{
	public forgot_password(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotuserid;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userID;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement userPan;
	
	public void userPan(String user)
	{
		userPan.sendKeys(user);
	}
	public void userID(String userid)
	{
		userID.sendKeys(userid);
	}
	public void forgotuserid()
	{
		forgotuserid.click();
	}
	
}
