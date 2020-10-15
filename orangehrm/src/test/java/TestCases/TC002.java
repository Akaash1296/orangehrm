package TestCases;


import org.testng.annotations.Test;

import Libraries.BaseTest;
import POM.HomePage;

public class TC002 extends BaseTest{
   
	@Test
	public void TestQualifications() throws InterruptedException {
		HomePage h = new HomePage(driver, aU);
		
		//Testing skills
		h.clickAdmin();
		h.clickSkills();
		h.editSkills();
		h.deleteSkills();
		
		//Testing education
		h.clickAdmin();
		h.clickEducation();
		h.editEducation();
		h.deleteEducation();

		//Testing languages

		h.clickLanguages();
		h.editLanguages();
		h.deleteLanguages();
 
		//Testing licenses
		h.clickLicense();
		h.editLicense();
		h.deleteLicense();
		
		//Testing memberships
		h.clickMembership();
		h.editMembership();
		h.deleteMembership();
	}
}
