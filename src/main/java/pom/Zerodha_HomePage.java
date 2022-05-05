package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zerodha_HomePage 
{
	
	public Zerodha_HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@icon='search']") private WebElement serchbox;
	//@FindBy(xpath="//span[text()='Orders'][1]") private WebElement order;
	//@FindBy(xpath="//a[@href='/positions']") private WebElement positions;
	@FindBy(xpath="//button[@data-balloon='Buy']") private WebElement buy;
	@FindBy(xpath="//input[@type='radio']") private List< WebElement >rediobutton;
	@FindBy(xpath="//ul[@class='omnisearch-results']//div//li[1]") private  WebElement searchresult;
	
	
	public void serchbox(String share_name)
	{
		serchbox.sendKeys(share_name);
		
	}
	
	public void serchresult(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(searchresult);
		act.perform();
		Thread.sleep(1000);
		buy.click();
		
		/*for(int i=0;i<serchresult.size();i++)
		{
			if(serchresult.get(i).getText().equalsIgnoreCase(name))
			{
				serchresult.get(i).click();
				Thread.sleep(2000);
				WebElement clickonby=driver.findElement(By.xpath("//button[@class='button-blue buy']"));
				clickonby.click();
			}
		}*/
		
	}
		public void buystock(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(2000);
			buy.click();
			Thread.sleep(2000);
			
		}
	
	
	public void selectRediobutton()
	{
		for(int i=0;i<rediobutton.size();i++)
		{
			String redio1=rediobutton.get(i).getText();
			if(redio1.equalsIgnoreCase("Intraday"))
			{
				rediobutton.get(i).click();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
