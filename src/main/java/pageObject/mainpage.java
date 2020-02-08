package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainpage {
	
	public WebDriver driver;
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	
	
	
	public mainpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement login()
	{
	return	driver.findElement(signin);
		
	}

	public WebElement gettitle()
	{
	return	driver.findElement(title);
		
	}
}
