package businessFlows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.commonUrlPage;
import pageObjects.fillFormPage;

public class authenticationValidate {

	WebDriver driver;

	@BeforeTest
	public void driverinst() {
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium-Jars\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();

	}
	
	@Test
	
	public void validateTheAuth(){
		
		commonUrlPage openUrl = new commonUrlPage(driver);
		fillFormPage fillCredentails = new fillFormPage(driver);
		
		openUrl.navigateApplication();
		fillCredentails.fillLoginCredentials();
		
	}
	

}
