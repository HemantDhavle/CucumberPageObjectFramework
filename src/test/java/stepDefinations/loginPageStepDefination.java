package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageStepDefination 
{
	testContextSetUp testContext;

	public loginPageStepDefination(testContextSetUp testContext) {
		this.testContext = testContext;
	}

	@Given("User is already on landing page")
	public void user_is_already_on_landing_page() {

		String title = testContext.pageManager.goToRegisterPage().doValidateLandingPage();
		if (title.contains("Login")) {
			System.out.println("User is landed on login page");
		} else {
			System.out.println("User is not on landing page");
		}
	}

	@When("User clicks on register link")
	public void user_clicks_on_register_link() {
		testContext.pageManager.goToRegisterPage().doClickRegisterLink();
	}

	@Then("User should be able to see {string} as page title")
	public void user_should_be_able_to_see_as_page_title(String string) {
		String actualHeader = testContext.pageManager.goToRegisterPage().doValidateRegisterPageHeader();
		Assert.assertEquals(actualHeader, string);
	}

}
