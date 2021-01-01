package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class Loginsteps {
	WebDriver driver;
	String username = "";
	String password = "";
	LoginPage loginPage;

	@Given("^User is On the Techfios Login Page$")
	public void User_is_On_the_Techfios_Login_Page() {
		driver = BrowserFactory.startBrowser();
	}

	@When("^User inters username as$")
	public void user_inters_username_as() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.EnterUsername("demo@techfios.com");

	}

	@When("^User enters password$")
	public void user_enters_password() {
		loginPage.Enterpassword("abc123");
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		loginPage.ClickOnSignin();
	}

	@Then("^User should be landing on dashboard page$")
	public void user_should_be_landing_on_dashboard_page() {
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		String Excepected = "Dashboard- iBilling";
		String Actual = loginPage.getTitle();
		Assert.assertEquals("Dashboard Page did not displayed", Excepected, Actual);
		System.out.println(Actual);
	}

}
