package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.elementUtils;

public class registrationPage 
{
	private WebDriver driver;
	public elementUtils eUtils;
	public registrationPage(WebDriver driver)
	{ 
		this.driver = driver;
		eUtils = new elementUtils(driver);
	}
	
	private By registerLink = By.xpath("//*[@id='column-right']/div/a[2]");
	private By registerPageTitle = By.xpath("//*[@id='content']/h1");
	private By firstName = By.xpath("//*[@id='input-firstname']");
	private By lastName = By.xpath("//*[@id='input-lastname']");
	private By email = By.xpath("//*[@id='input-email']");
	private By telephone = By.xpath("//*[@id='input-telephone']");
	private By password = By.xpath("//*[@id='input-password']");
	private By confirmPassword = By.xpath("//*[@id='input-confirm']");
	private By subcribedYes = By.xpath("//*[@id='content']/form/fieldset[3]/div/div/label[1]/input");
	private By agree = By.xpath("//*[@id='content']/form/div/div/input[1]");
	private By continueButton = By.xpath("//*[@id='content']/form/div/div/input[2]");
	private By successMsg = By.xpath("//*[@id='content']/h1");
	public String doValidateLandingPage()
	{
		System.out.println(driver.getTitle());
		return driver.getTitle();
		/*
		 * System.out.println(eUtils.doGetPageTitle()); return eUtils.doGetPageTitle();
		 */
	}
	public void doClickRegisterLink()
	{
		eUtils.doClick(registerLink);
	}
	public String doValidateRegisterPageTitle()
	{
		return eUtils.doGetPageTitle();
	}
	
	public String doValidateRegisterPageHeader()
	{
		return eUtils.getElement(registerPageTitle).getText();
	}
	
	
	public void doRegistration(String firstName, String lastName, String email, String telephone, String password, String confirmPassword)
	{
		eUtils.doSendKeys(this.firstName, firstName);
		eUtils.doSendKeys(this.lastName, lastName);
		eUtils.doSendKeys(this.email, email);
		eUtils.doSendKeys(this.telephone, telephone);
		eUtils.doSendKeys(this.password, password);
		eUtils.doSendKeys(this.confirmPassword, confirmPassword);
		
	}
	
	public void doClickContinueButton()
	{
		eUtils.doClick(subcribedYes);
		eUtils.doClick(agree);
		eUtils.doClick(continueButton);
	}
	public String doValidateSuccessfulRegistration()
	{
		return eUtils.getElement(successMsg).getText();
	}
}
