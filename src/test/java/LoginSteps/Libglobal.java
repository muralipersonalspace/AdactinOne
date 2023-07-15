package LoginSteps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.collection.CharObjectMap;

public class Libglobal {
	
	public static WebDriver driver;

	public static WebDriver LaunchBrowser1(String string) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		return driver;
	}

	public static void openAppUrl(String url) {	
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void implicitWait(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void closeBrowser() {
		driver.close();

	}

	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public Options manage() {
		Options manage = driver.manage();
		return manage;
	}

	public TargetLocator targetLocator() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public void getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
	}

	public void findElement(WebElement refname, String data) {
		refname.sendKeys("data");
	}

	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void acceptAlert() {
		switchToAlert().accept();
	}

	public void dismissAlert() {
		switchToAlert().dismiss();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public boolean displayed(WebElement dis) {
		boolean b = dis.isDisplayed();
		return b;
	}

	public boolean selected(WebElement sel) {
		boolean c = sel.isSelected();
		return c;
	}

	public void SelectOptionText(WebElement se, String text) {
		Select s = new Select(se);
		s.deselectByVisibleText(text);
	}
	public String PageUrl() {
	  String currentUrl = driver.getCurrentUrl();
	  return currentUrl;

	}
	public String getAttributeValue(WebElement e, String data) {
		String attribute = e.getAttribute(data);
		return attribute;
      

	}

	public void selectByIndex(WebElement e, int index) {
		Select s1 = new Select(e);
		s1.selectByIndex(index);
	}

	public void moveToElement(WebElement target) {
		Actions acc = new Actions(driver);
		acc.moveToElement(target);
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target);
	}

	public void enterValue(WebElement enterValue , String data) {
		enterValue.sendKeys(data);
      }
	
 public void elementClick(WebElement element) {
	 element.click();
 }
	 
	 public String getValue2dWithHeader(DataTable datatable, int index, String key) {
		 List<Map<String,String>> list = datatable.asMaps();
		 Map<String, String> map = list.get(index);
		 String x = map.get(key);
		 return x;
		}
	 public void pressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
	 public static String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
}
	 public void Selectoptiontext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
}
	 public void pageLoadWait(long seconds) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));

	}
	 public byte[] TakesScreenshot() {
	   TakesScreenshot takescreenshot =(TakesScreenshot) driver;
	   byte[] as = takescreenshot.getScreenshotAs(OutputType.BYTES);
	return as;

	}
	 
	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}

}




	





