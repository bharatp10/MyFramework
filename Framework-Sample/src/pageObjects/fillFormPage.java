package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class fillFormPage extends commonUrlPage {
	
	public fillFormPage(WebDriver driver){
		super(driver);
	}
	
	public String fillLoginCredentials(){
		
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed(), "facebook page not opened");
		
		return "";
	}

}
