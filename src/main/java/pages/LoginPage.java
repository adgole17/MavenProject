package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  {
	WebDriver driver;
	
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		wait = new WebDriverWait(driver, 50);
	}

	public void loginWithCredentials() {
		WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));

		username.sendKeys("NZY314");

		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));

		password.sendKeys("@Lifelong@17");

		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
		
		loginbutton.click();
		
	}
	
	
	public void enterPin()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("172617");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	
	public boolean verifyUrl()
	{
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button-blue']")));
	 String url = driver.getCurrentUrl();
	 
	 System.out.println(url);
	 
	 if(url.contains("dashboard"))
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	}
	

}