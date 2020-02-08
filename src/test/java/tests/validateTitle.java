package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.loginpage;
import pageObject.mainpage;
import resources.base;

public class validateTitle extends base{
	
	@Test()
	public void home() throws IOException {
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com/");
		mainpage mn=new mainpage(driver);
		Assert.assertEquals(mn.gettitle().getText(), "FEATURED COURSES");
		System.out.println("I am maddy");
		System.out.println("I am maddy1");
		System.out.println("I am maddy2");
		System.out.println("I am maddy3");
	}
	
		
		@AfterTest
		public void closure()
		{
			driver.quit();
		}
		
		
		
			}
	

				
		
		
