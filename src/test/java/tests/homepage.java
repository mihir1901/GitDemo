package tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.loginpage;
import pageObject.mainpage;
import resources.base;

public class homepage extends base{
	
	@Test(dataProvider="getdata")
	public void home(String username, String password) throws IOException {
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		mainpage mn=new mainpage(driver);
		mn.login().click();
		loginpage lp=new loginpage(driver);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.button().click();
		driver.quit();
		
			}

	
	@DataProvider
	public Object[][] getdata()
	{
		//Row stands for how many different data types test should run
		//columns stands for how many values per each test
		Object [] []data=new Object[2] [2];
		
		//1th Row (FIRST data combination)
		data[0][0]="mihirgandhi123";
		data[0][1]="passion1";
		
		//2nd row (SECOND data combination)
		data[1][0]="priyankgandhi123";
		data[1][1]="passion2";
		
		return data;
		}


	
}
