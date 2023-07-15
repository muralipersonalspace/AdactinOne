package LoginSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Libglobal {
	
	public LoginPage() {
PageFactory.initElements(driver, this);		
		}
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
private WebElement txtpassword;
	
	@FindBy(id="login")
private WebElement btnlogin;
	
	@FindBy(xpath="//b[contains(text(),'Invalid')]")
	private WebElement invalidLogin;
	
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getInvalidLogin() {
		return invalidLogin;
	}
}
