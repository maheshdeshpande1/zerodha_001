package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pogo.Driver_class;
import pom.Zerodha_Login;


public class ZerodhaTest1
{
	//Test1----------
	@Test
	public static  void LoginWithValidInput() throws EncryptedDocumentException, IOException, InterruptedException
	{
    	   //take deta from excel
		String  usernam1e=utilities.Excel1.getdata("credentials", 0, 1);
		String  password1=utilities.Excel1.getdata("credentials", 1, 1);
		System.out.println(password1);
		String   takepin=utilities.Excel1.getdata("credentials", 2, 1);
		
        //call the  methode of zerodha Login Page
		
		    WebDriver driver=  Driver_class.driversetup("https://kite.zerodha.com/");
		   
		
		Zerodha_Login obj=new Zerodha_Login(driver);
		obj.username(usernam1e);//caiing usename() methode
		obj.password(password1);//caiing password() methode
		obj.click();
		Thread.sleep(2000);
		
		obj.sendPin(takepin);//caiing sendpin() methode
		Thread.sleep(2000);
		obj.button();
		
	}
	//Test2---------------------
    /*   @Test
	public void LoginWithblankInput()
	{
    	   //test 2 for invalid login
    	   
    	   WebDriver driver=Driver_class.driversetup();
	  driver.get("https://kite.zerodha.com/");

	  Zerodha_Login obj=new Zerodha_Login(driver);
		obj.username(null);
		obj.password(null);
		obj.click();
		
	}*/


}
