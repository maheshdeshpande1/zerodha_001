package pogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver_class 
{
	public static WebDriver driversetup(String url)
	{
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		 
		System.setProperty("webdriver.chrome.driver", "F:/velocity_snehal/Zerodha_project/src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver(ops);//Complete method in the chrome driver return to interface is called upcasting
		 driver.get(url);
		return driver;
	}

	
}
