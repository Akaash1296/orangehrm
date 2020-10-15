package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.AutoUtils;

public class HomePage extends BasePage {

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	@FindBy(xpath="//b[text()='Leave']")
	private WebElement leave;
	@FindBy(xpath="//b[text()='Recruitment']")
	private WebElement recruitment;

	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//a[text()='Qualifications']")
	private WebElement qualifications;
	
	@FindBy(xpath="//a[text()='Skills']")
	private WebElement skills;
	
	@FindBy(xpath="//a[text()='Languages']")
	private WebElement languages;
	
	@FindBy(xpath="//a[text()='Education']")
	private WebElement education;
	
	@FindBy(xpath="//a[text()='Licenses']")
	private WebElement licenses;
	
	@FindBy(xpath="//a[text()='Memberships']")
	private WebElement memberships;
	
	@FindBy(id="btnAdd")
	private WebElement buttonAdd;
	
	@FindBy(name="skill[name]")
	private WebElement skillName;
	
	@FindBy(name="skill[description]")
	private WebElement skillDescription;
	
	@FindBy(name="language[name]")
	private WebElement languageName;
	
	@FindBy(name="education[name]")
	private WebElement educationName;
	
	@FindBy(name="license[name]")
	private WebElement licenseName;
	
	@FindBy(name="membership[name]")
	private WebElement membershipName;
	
	@FindBy(xpath="(//input[@class='checkboxAtch'])[19]")
	private WebElement seleniumCheck;
	
	@FindBy(xpath="(//input[@class='checkboxAtch'])[2]")
	private WebElement educationCheck;
	
	@FindBy(xpath="(//input[@class='checkboxAtch'])[6]")
	private WebElement hindiCheck;
	
	@FindBy(xpath="(//input[@class='checkboxAtch'])[9]")
	private WebElement teluguCheck;
	
	@FindBy(xpath="(//input[@class='checkboxAtch'])[7]")
	private WebElement licenseCheck;
	
	@FindBy(xpath="(//input[@name='chkSelectRow[]'])[5]")
	private WebElement membershipCheck;
	
	@FindBy(id="btnDelete")
	private WebElement deleteMembership;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement dialogDeleteButtonOk;
	
	@FindBy(id="btnSave")
	private WebElement buttonSave;
	
	@FindBy(id="btnDel")
	private WebElement buttonDelete;
		
	
	public HomePage(WebDriver driver, AutoUtils autoUtils) {
		super(driver, autoUtils);
		// TODO Auto-generated constructor stub
	}

	public void clickLogOut() {
		autoUtils.clickElement(logOut, "Log Out");
	}
	
	public void clickLeave() {
		autoUtils.clickElement(leave, "Leave");
		
	}
	
	public void clickRecruitment() {
		autoUtils.clickElement(recruitment, "Recruitment");
	}
	
	public void clickAdmin() {
		autoUtils.clickElement(admin, "Admin");
	}
	
	public void clickSkills() {
		autoUtils.clickElement(qualifications, "Qualifications");
		autoUtils.clickElement(skills, "Skills");
	}
	
	public void editSkills() {
		autoUtils.clickElement(buttonAdd, "Add Skill");
		autoUtils.typeText(skillName, "Name", "Selenium");
		autoUtils.typeText(skillDescription, "Description", "Automation Tool.");
		autoUtils.clickElement(buttonSave, "Save Skill");
	}
	
	public void deleteSkills() {
		autoUtils.clickElement(seleniumCheck, "Checking Selenium");
		autoUtils.clickElement(buttonDelete, "Delete Skill");
	}
	
	public void clickEducation() {
		autoUtils.clickElement(qualifications, "Qualifications");
		autoUtils.clickElement(education, "Education");
	}
	
	public void editEducation() {
		autoUtils.clickElement(buttonAdd, "Add Education");
		autoUtils.typeText(educationName, "Level", "Associate's Degree");
		autoUtils.clickElement(buttonSave, "Save Education");
	}
	
	public void deleteEducation() {
		autoUtils.clickElement(educationCheck, "Checking Education");
		autoUtils.clickElement(buttonDelete, "Delete Education");
	}
	
	public void clickLanguages() {
		autoUtils.clickElement(qualifications, "Qualifications");
		autoUtils.clickElement(languages, "Languages");
	}
	
	public void editLanguages() {
		autoUtils.clickElement(buttonAdd, "Add Languages");
		autoUtils.typeText(languageName, "Name", "Hindi");
		autoUtils.clickElement(buttonSave, "Save Languages");
		autoUtils.clickElement(buttonAdd, "Add Languages");
		autoUtils.typeText(languageName, "Name", "Telugu");
		autoUtils.clickElement(buttonSave, "Save Languages");
	}
	
	public void deleteLanguages() {
		autoUtils.clickElement(hindiCheck, "Checking Hindi");
		autoUtils.clickElement(teluguCheck, "Checking Telugu");
		autoUtils.clickElement(buttonDelete, "Delete Languages");
	}
	
	public void clickLicense() {
		autoUtils.clickElement(qualifications, "Qualifications");
		autoUtils.clickElement(licenses, "Licenses");
	}
	
	public void editLicense() {
		autoUtils.clickElement(buttonAdd, "Add Licenses");
		autoUtils.typeText(licenseName, "Name", "Microsoft Technology Associate (MTA)");
		autoUtils.clickElement(buttonSave, "Save Licenses");
	}
	
	public void deleteLicense() {
		autoUtils.clickElement(licenseCheck, "Checking Licenses");
		autoUtils.clickElement(buttonDelete, "Delete Licenses");
	}
	
	public void clickMembership() {
		autoUtils.clickElement(qualifications, "Qualifications");
		autoUtils.clickElement(memberships, "Memberships");
	}
	
	
	public void editMembership() {
		autoUtils.clickElement(buttonAdd, "Add Memberships");
		autoUtils.typeText(membershipName, "Name", "SCVRD");
		autoUtils.clickElement(buttonSave, "Save Memberships");
	}
	
	public void deleteMembership() {
		autoUtils.clickElement(membershipCheck, "Checking Memberships");
		autoUtils.clickElement(deleteMembership, "Delete Memberships");
		autoUtils.clickElement(dialogDeleteButtonOk, "Ok button");
	}

	
	
	
}
