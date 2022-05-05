package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha_Login {
	public Zerodha_Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@id='userid']") private WebElement username;
	@FindBy(xpath ="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@id='pin']")      private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement button;
	
	public void  username(String user)
	{
		username.sendKeys(user);
	}
	
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void click()
	{
		submit.click();
	}

	public void  sendPin(String pin1)
	{
		pin.sendKeys(pin1);
	}
	public void  button()
	{
		button.click();
	}
}
