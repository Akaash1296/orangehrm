package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Libraries.AutoUtils;

public class BasePage {

	public WebDriver driver;
	public AutoUtils autoUtils;
	
	public BasePage(WebDriver driver, AutoUtils autoUtils) {
		this.driver = driver;
		this.autoUtils = autoUtils;
		PageFactory.initElements(driver, this);
	}
}
