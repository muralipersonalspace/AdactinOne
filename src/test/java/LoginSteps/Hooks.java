package LoginSteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hooks extends Libglobal {
	
	@Before()
	public void beforeScenario() {
		System.out.println("@After...");
		LaunchBrowser1("chrome");
		maximizeWindow();
		implicitWait(20);
		pageLoadWait(20);
		openAppUrl("https://adactinhotelapp.com/index.php");
		}
	@After()
	public void afterScenario(Scenario s) {
		System.out.println("@After...");
		s.embed(TakesScreenshot(), "image/png");
		deleteCookies();
		closeBrowser();
		}

}
