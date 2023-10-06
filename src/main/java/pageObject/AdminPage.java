package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver local_driver;
	
	public AdminPage(WebDriver remote_driver) {
		
		local_driver = remote_driver;
		PageFactory.initElements(remote_driver,this);
		
	}
	
	// For normal Java Project - 
	// WebElement txtEmail = driver.findElement(By.xpath("//input[@id='Email']"));
	
	// For Maven Project - 
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement btnLogout;
	
	
	// User define method to perform operation on above web element
	
	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}

}
