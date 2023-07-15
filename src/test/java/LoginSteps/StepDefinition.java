package LoginSteps;

import java.awt.AWTException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Libglobal {
	
	@Given("user is on adactin application")
	public void user_is_on_adactin_application() {
	}

	@When("user enters valid{string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		LoginPage loginpage = new LoginPage();
		enterValue(loginpage.getTxtusername(),username);
		enterValue(loginpage.getTxtpassword(), password);
		}

	@And("user clicks login button")
	public void user_clicks_login_button() {
	   LoginPage loginpage = new LoginPage();
	   elementClick(loginpage.getBtnlogin());
	}

	@Then("user verfies login success message {string}")
	public void user_verfies_login_success_message(String expectedloginmessage) {
	    System.out.println(expectedloginmessage);
	}

	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String username, String password) {
	    LoginPage loginpage = new LoginPage();
	    enterValue(loginpage.getTxtusername(), username);
	    enterValue(loginpage.getTxtpassword(), password);
	    elementClick(loginpage.getBtnlogin());
	}

	@Then("user verifies error messege {string}")
	public void user_verifies_error_messege(String expectederrormessage) {
		System.out.println(expectederrormessage);
	    }

	@When("user enters username and password and press enter key")
	public void user_enters_username_and_password_and_press_enter_key(io.cucumber.datatable.DataTable d) throws AWTException {
		LoginPage loginpage = new LoginPage();
		enterValue(loginpage.getTxtusername(), getValue2dWithHeader(d, 0, "username"));
		enterValue(loginpage.getTxtpassword(), getValue2dWithHeader(d, 0,"password"));
		pressEnter();
	   
	}

	@Then("user verifies login success message {string}")
	public void user_verifies_login_success_message(String expectedloginmessage) {
	    System.out.println(expectedloginmessage);
	}



}
