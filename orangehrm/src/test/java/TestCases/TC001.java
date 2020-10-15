package TestCases;

import org.testng.annotations.Test;

import Libraries.BaseTest;
import POM.HomePage;

public class TC001 extends BaseTest{

	@Test
	public void TestTC001() {
		driver.navigate().refresh();
		HomePage h = new HomePage(driver, aU);
		h.clickLeave();
		h.clickRecruitment();
		
	}
}
