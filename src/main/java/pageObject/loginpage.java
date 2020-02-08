package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By login_button=By.xpath("	//input[@name='commit']");
	
	

	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getemail()
	
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getpassword()
	
	{
		return driver.findElement(password);
		
	}
	
	public WebElement button()
	
	{
		return driver.findElement(login_button);
		
	}
	
}
