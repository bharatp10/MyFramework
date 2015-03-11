package pageObjects;

import org.openqa.selenium.WebDriver;

public class commonUrlPage {
	
	public WebDriver driver;
	
	public commonUrlPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public fillFormPage navigateApplication(){
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		return new fillFormPage(driver);
	}

}
