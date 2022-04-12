package stepDefinations;

import io.cucumber.java.After;

public class Hooks 
{
	testContextSetUp testContext;
	public Hooks(testContextSetUp testContext)
	{
		this.testContext = testContext;
	}
	
	@After
	public void tearDown()
	{
		testContext.bUtility.getDriver().quit();
	}
}
