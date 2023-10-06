package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomer {

WebDriver local_driver;
	
	public AddNewCustomer(WebDriver remote_driver) {
		
		local_driver = remote_driver;
		PageFactory.initElements(remote_driver,this);
		
	}
	
	//web elements
	
//	@FindBy(xpath = "//input[@id='Email']")
//	WebElement txttEmail;
	
//	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
//	WebElement lnkCustomes_menu;
	
    By lnkCustomes_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	
	By lnkCustomers_menu_item=By.xpath("//p[text()=' Customers']");
	
	By btnAddNew=By.xpath("//a[@class='btn btn-primary']");
	
	By txtEmail=By.xpath("//input[@id='Email']");
	
	By txtPassword=By.xpath("//input[@id='Password']");
	
	By txtFirstName=By.xpath("//input[@id='FirstName']");

	By txtLastName=By.xpath("//input[@id='LastName']");

	By rdMaleGender=By.id("Gender_Male");
	
	By rdFemaleGender=By.id("Gender_Female");
	
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	
	By txtCompanyName=By.xpath("//input[@id='Company']");

	By txtAdmitContent=By.xpath("//textarea[@id='AdminComment']");

	By btnSave=By.xpath("//button[@name='save']");
	
	@FindBy(xpath = "//*[@id='VendorId']")
	WebElement dropdownVendorMgr;
	
	//User defined methods - we can call in Step definition file
	
		public String getPageTitle() {
			return local_driver.getTitle();
		}
		
		public void clickOnCustomesMenu() {
			local_driver.findElement(lnkCustomes_menu).click();
		}
		
		public void clickOnCustomesMenuItem() {
			local_driver.findElement(lnkCustomers_menu_item).click();
		}
		
		public void clickOnAddNew() {
			local_driver.findElement(btnAddNew).click();
		}
		
		public void SetEmail(String email) {
			local_driver.findElement(txtEmail).sendKeys(email);;
		}
		
		public void SetPassword(String password) {
			local_driver.findElement(txtPassword).sendKeys(password);;
		}
		
		public void SetFirstName(String fname) {
			local_driver.findElement(txtFirstName).sendKeys(fname);;
		}
		
		public void SetLastName(String lname) {
			local_driver.findElement(txtLastName).sendKeys(lname);;
		}
		
		public void SetGender(String gender) {
			if(gender.equals("Male")) {
				local_driver.findElement(rdMaleGender).click();
				
			}else {
				local_driver.findElement(rdFemaleGender).click();
			}
		}
		
		public void enterDob(String dob)
		{
			local_driver.findElement(txtDob).sendKeys(dob);

       }
		
		public void enterManagerOfVendor(String value)
		{
			Select drp=new Select(dropdownVendorMgr);
			drp.selectByVisibleText(value);
		}
		
		public void SetCompanyName(String comName) {
			local_driver.findElement(txtCompanyName).sendKeys(comName);;
		}
		
		public void SetAdminContent(String content) {
			local_driver.findElement(txtAdmitContent).sendKeys(content);;
		}
		
		public void clickOnSave() {
			local_driver.findElement(btnSave).click();
		}
}
