package stepDefinitionFiles;

import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomer;
import pageObject.AdminPage;
import utilities.ReadConfig;

public class BaseClass {
	
	public WebDriver driver;
	
	public AdminPage admin;
	
	public ReadConfig readConfig;
	
	public AddNewCustomer addCust;

}
