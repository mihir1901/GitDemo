package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browsername=System.getProperty("browser");
		//String browsername=prop.getProperty("browser");
		
		
		if(browsername.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\chromedriver.exe"));
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--headless");
			driver=new ChromeDriver();

		}
		
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
	
		
	
		driver.manage().window().maximize();
		return driver;
		
		
	}

}
