package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations", monochrome=true, plugin={"html:target/cucumber.html"})
public class testNG extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
    public Object[][] scenarios()
    {
		return super.scenarios();
    }
}
