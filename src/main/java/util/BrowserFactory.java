package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	//global so all methods can use
	static WebDriver driver;
	
	public static WebDriver startBrowser() {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//return the driver to test class
	return driver;
	}

}
 