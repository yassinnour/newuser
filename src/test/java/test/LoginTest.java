package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.BasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest extends BasePage {
	WebDriver driver;

	@BeforeMethod
	public void launchbrowser () {

		// start the browser and save the driver in the test class
		driver = BrowserFactory.startBrowser();

	}

@Test(priority = 1)
	public void validUserShouldBeAbleToLogIn() {

		// take to the site
		driver.get("http://techfios.com/test/billing/?ng=admin/");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		// validate page show up using the title
		String expectedTitle = "Login - TechFios Test Application -Billing";
		String actualTitle = loginPage.getPageTitle();
		
		//call the login method from the LoginPage class
		loginPage.login("techfiosdemo@gmail.com", "abc123");
		
		

	}
	
	
	@Test(priority = 2)
	public void invalidUserShouldNotLogIn() throws InterruptedException {
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("techfiosdemo@gmail.com", "abc123");
		
	}
	@AfterMethod
	public void close() {
		
		driver.close();
		driver.quit();
	}
}
