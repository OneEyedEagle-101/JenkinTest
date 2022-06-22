package com.pages.com.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.LoginPage;
import com.pages.SearchAdminPage;

public class SearchAdminTest extends LibraryClass{

	@BeforeMethod
	public void launch()
	{
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 1)
	public void loginTest()
	{
		LoginPage pageObj=new LoginPage(driver);
		pageObj.login("Admin", "admin123");
		SearchAdminPage searchAdmin = new SearchAdminPage(driver);
		searchAdmin.search("Admin", "Admin","Rajiv Sinha", "Enabled");
	}
	
	
}
