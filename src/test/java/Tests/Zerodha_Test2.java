package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pogo.Driver_class;
import pom.Zerodha_HomePage;
import pom.Zerodha_Login;
import utilities.Excel1;


public class Zerodha_Test2 
{
	WebDriver driver;
	@Test
	public void Test_Homepage() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String  usernam1e=Excel1.getdata("credentials", 0, 1);
		String  password1=Excel1.getdata("credentials", 1, 1);
		System.out.println(password1);
		String   takepin=Excel1.getdata("credentials", 2, 1);
		
        //call the  method of zerodha Login Page
		 driver=Driver_class.driversetup("https://kite.zerodha.com/");
		Zerodha_Login obj=new Zerodha_Login(driver);
		obj.username(usernam1e);//calling username() method
		obj.password(password1);//calling password() method
		obj.click();
		Thread.sleep(2000);
		
		obj.sendPin(takepin);//calling sendpin() method
		Thread.sleep(2000);
		obj.button();
		Zerodha_HomePage ob2=new Zerodha_HomePage(driver);
		//ob2.positions();
		Thread.sleep(2000);

		ob2.serchbox("SBIN");
		
		ob2.serchresult(driver);
		ob2.selectRediobutton();
		
		
		
	}
	
}
