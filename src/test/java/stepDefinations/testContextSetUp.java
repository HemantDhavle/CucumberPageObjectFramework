package stepDefinations;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverFactory.browserUtility;
import pageFactory.pageFactoryManager;

public class testContextSetUp 
{
	public WebDriver driver;
	public browserUtility  bUtility;
	public Properties prop;
	public pageFactoryManager pageManager;
	
	public testContextSetUp()
	{
		bUtility = new browserUtility();
		prop = bUtility.init_property();
		//driver = bUtility.init_driver(prop);
		pageManager = new pageFactoryManager(bUtility.init_driver(prop));
		
	}

}
