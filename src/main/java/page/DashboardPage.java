package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class DashboardPage {

	
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library
	
	@FindBy (how = How.XPATH, using = "//H2[contains(text(), 'Dashboard ')]")WebElement DASHBOARD_VALIDATION_ELEMENT;
	
	//Interactive Method
	public void validationDashboard() {
		
		String dashBoardText = DASHBOARD_VALIDATION_ELEMENT.getText();
		Assert.assertEquals("Wrong Page", dashBoardText, "Dashboard");
	}
}
