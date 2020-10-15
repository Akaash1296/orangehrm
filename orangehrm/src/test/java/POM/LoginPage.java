package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.AutoUtils;

public class LoginPage extends BasePage  {

	@FindBy(id="txtUsername")
	private WebElement userName;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement buttonLogin;
	
	
	public LoginPage(WebDriver driver, AutoUtils autoUtils) {
		super(driver, autoUtils);
		// TODO Auto-generated constructor stub
	}
	
	public void setUserName() {
		autoUtils.typeText(userName, "User Name", "Admin");
	}
	
	public void setPassword() {
		autoUtils.typeText(password, "Password", "admin123");
	}
	
	public void clickLogin() {
		autoUtils.clickElement(buttonLogin, "Login");
	}

}
