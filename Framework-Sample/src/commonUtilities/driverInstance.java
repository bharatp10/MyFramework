package commonUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverInstance {
	
	protected WebDriver driver;

	@BeforeSuite
	public void startBrowser() {
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium-Jars\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();

	}
	
	@AfterSuite
	public void closeBrowser(){
		
		driver.close();
	}
	
}
