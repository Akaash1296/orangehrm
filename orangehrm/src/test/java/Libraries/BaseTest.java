package Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements IAutoConstants {

	public WebDriver driver;
	public AutoUtils aU;
	 @BeforeClass
	 public void openApp() {
		 if(browser.equalsIgnoreCase("Opera")) {
			 System.setProperty("", driverPath);
			 driver = new OperaDriver();			 
		 } 
		 else {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();			 
			 aU = new AutoUtils(driver);
		 }
		 driver.get(url);
		 LoginPage l = new LoginPage(driver,aU);
		 l.setUserName();
		 l.setPassword();
		 l.clickLogin();
	 }
	 
	 @AfterClass
	 public void closeApp() {
		 driver.quit();
	 }
	 
}
