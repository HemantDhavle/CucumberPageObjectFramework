package stepDefinations;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registrationPageStepDefination {
	testContextSetUp testContext;

	public registrationPageStepDefination(testContextSetUp testContext) {
		this.testContext = testContext;
	}

//	@Given("User is already on landing page")
//	public void user_is_already_on_landing_page() {
//
//		String title = testContext.pageManager.goToRegisterPage().doValidateLandingPage();
//		if (title.contains("Login")) {
//			System.out.println("User is landed on login page");
//		} else {
//			System.out.println("User is not on landing page");
//		}
//	}
//
//	@When("User clicks on register link")
//	public void user_clicks_on_register_link() {
//		testContext.pageManager.goToRegisterPage().doClickRegisterLink();
//	}
//
//	@Then("User should be able to see {string} as page title")
//	public void user_should_be_able_to_see_as_page_title(String string) {
//		String actualHeader = testContext.pageManager.goToRegisterPage().doValidateRegisterPageHeader();
//		Assert.assertEquals(actualHeader, string);
//	}
	@Given("User is already on registration page") 
	public void user_is_already_on_registration_page() { 
		String actualTitle = testContext.pageManager.goToRegisterPage().doValidateRegisterPageTitle();
		if(actualTitle.contains("Register")) {
		System.out.println("User is on registration page"); } else {
		System.out.println("User is not on registration page"); } }
	  
	 @When("User enters following details") 
	 public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
	  List<List<String>> data = dataTable.asLists(); String firstName =
	  data.get(0).get(0); String lastName = data.get(0).get(1); String email =
	  data.get(0).get(2); String telephone = data.get(0).get(3); String password =
	  data.get(0).get(4); String confirmPassword = data.get(0).get(5);
	  testContext.pageManager.goToRegisterPage().doRegistration(firstName, lastName,
	  email, telephone, password, confirmPassword); 
	  }
	 
	  @When("User clicks on continue button") 
	  public void user_clicks_on_continue_button() {
		  testContext.pageManager.goToRegisterPage().doClickContinueButton(); }
	  
	  @Then("^Registration should be \"([^\"]*)\" displayed as success message$")
	 public void registration_should_be_something_displayed_as_success_message(String strArg1)
	 throws Throwable { String actualMsg =
			 testContext.pageManager.goToRegisterPage().doValidateSuccessfulRegistration();
	 Assert.assertEquals(actualMsg, strArg1); }
	
}
