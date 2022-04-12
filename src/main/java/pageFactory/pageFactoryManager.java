package pageFactory;

import org.openqa.selenium.WebDriver;

public class pageFactoryManager 
{
	public WebDriver driver;
	registrationPage registerPage;
	public pageFactoryManager(WebDriver driver)
	{ 
		this.driver = driver;
	}
	
	

	public registrationPage goToRegisterPage() {
		registerPage = new registrationPage(driver);
		return registerPage;
	}

}
