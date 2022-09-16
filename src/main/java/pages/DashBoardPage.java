package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DashBoardPage extends BaseClass  {
	
WebDriver driver;
	
	WebDriverWait wait;
	@FindBy(xpath ="//*[@class='button-blue']" ) 
	WebElement getstartedbutton;
	
	
			
	@FindBy(xpath ="(//*[@type='text'])[2]" ) 
	WebElement searchfield;
	
	@FindBy(xpath ="(//*[@class='button-outline button-blue'])[2]" ) 
	WebElement buysharebutton ;
	
	
	
	@FindBy(xpath ="//*[@class='submit'] " ) 
	WebElement buybutton ;
	
	@FindBy(xpath ="//*[@class='button-outline button-orange'] " ) 
	WebElement sellbutton;
	
	
	
	@FindBy(xpath ="//*[@class='submit'] " ) 
	WebElement sellshare;
	
	public DashBoardPage(WebDriver driver) throws IOException
	{
		
	this.driver= driver;
	wait = new WebDriverWait(driver, 50);
	PageFactory.initElements(driver, this);
		
	}
	
	public void searchShare()
	 
	{
		wait.until(ExpectedConditions.elementToBeClickable(getstartedbutton));
		
		getstartedbutton.click();
		
		searchfield.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(searchfield, Keys.ENTER).perform();
		
		
		
	}
	
    public void buyshare()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(buysharebutton));
    	
    	buysharebutton.click();
    	
//    	wait.until(ExpectedConditions.elementToBeClickable(buybutton));
//    	
//    	buybutton.click();
    }
    
    public void sellShare()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(sellbutton));
    	
    	sellbutton.click();
    	
//    	wait.until(ExpectedConditions.elementToBeClickable(sellshare));
//    	
//    	sellshare.click();
    	
    	
    }
}
