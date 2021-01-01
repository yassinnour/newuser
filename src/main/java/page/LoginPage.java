package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// library of Elements
	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.NAME, using = "login")
	WebElement LOGIN_ELEMENT;

	// Methods to interact with Elements

	public void EnterUsername(String username) {
		USERNAME_ELEMENT.sendKeys(username);

	}

	public void Enterpassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);

	}

	public void ClickOnSignin() {

		LOGIN_ELEMENT.click();
	}

	public String getTitle() {
	
	return driver.getTitle();
	}
}
