/*package commonUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverInstance {
	
	protected WebDriver driver;
	
	

	@BeforeSuite
	public void startBrowser() {
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium-Jars\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		
		//driver = new FirefoxDriver();
		for(StackTraceElement each :  Thread.currentThread().getStackTrace()){
			   System.out.println("start browser: "+each.getClassName());
			  }
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium-Jars\\chromedriver.exe");

		driver = new ChromeDriver();

	}
	
	@AfterSuite
	public void closeBrowser(){
		for(StackTraceElement each :  Thread.currentThread().getStackTrace()){
			
			
			   System.out.println("closebrowser: "+each.getClassName());
			  }
		
		driver.close();
	}
	
}
*/


package commonUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class driverInstance {
	
	public static WebDriver driver;

	private static ThreadLocal<InternetExplorerDriver> threadLocalWebDriver = new ThreadLocal<InternetExplorerDriver>();

	public static WebDriver driver() {
		return threadLocalWebDriver.get();
	}

	//@BeforeSuite
	@BeforeMethod
	public void init() {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "E:\\Selenium-Jars\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();
	}

	//@AfterSuite
	@AfterMethod
	public void closeSession() {
		driver.quit();
	}

}
