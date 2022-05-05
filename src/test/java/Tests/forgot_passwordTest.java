package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pogo.Driver_class;
import pom.forgot_password;

public class forgot_passwordTest {
	WebDriver driver;
     @BeforeMethod
	public void setup()
	{
		driver=Driver_class.driversetup("https://kite.zerodha.com/");
	}
	
	
	@Test
    public void ForgotPasswordTest()
    {
    	forgot_password obj=new forgot_password(driver);
    	obj.forgotuserid();
    	obj.userID("velocity");
    	obj.userPan("12345");
    	
    }
	
}
