package businessFlows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonUtilities.driverInstance;
import pageObjects.commonUrlPage;
import pageObjects.fillFormPage;

public class validateLogin extends driverInstance {

	
	
	@Test 
	
	public void validateTheAuth(){
		
		System.out.println("class 2");
		
		commonUrlPage openUrl = new commonUrlPage(driver);
		fillFormPage fillCredentails = new fillFormPage(driver);
		
		openUrl.navigateApplication();
		fillCredentails.fillLoginCredentials();
		
	}
	
/*	@AfterMethod
	public void closevalidateBrowser() {

		driver.close();
	}
	*/

}
