package StepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class AppConfig 
{
  WebDriver driver;
  WebDriverWait wait;
  @io.cucumber.java.Before
  public void setUp(Scenario scenario) throws MalformedURLException
  {
	  String username=System.getenv("SAUCE_USERNAME");
	  String accesskey=System.getenv("SAUCE_ACCESS_KEY");
	  ChromeOptions chromeOpts=new ChromeOptions();
	  MutableCapabilities sauceOpts=new MutableCapabilities();
	  sauceOpts.setCapability("name", scenario.getName());
	  sauceOpts.setCapability("username", username);
	  sauceOpts.setCapability("AccessKey", accesskey);
	  MutableCapabilities browserOptions=new MutableCapabilities();
	  browserOptions.setCapability(ChromeOptions.CAPABILITY, chromeOpts);
	  browserOptions.setCapability("sauce:options", sauceOpts);
	  browserOptions.setCapability("browserName", "chrome");
	  browserOptions.setCapability("browserVersion", "Latest");
	  browserOptions.setCapability("platformName", "windows8.1");
	  String sauceUrl="https://app.saucelabs.com/";
	  URL url=new URL(sauceUrl);
	  driver=new RemoteWebDriver(url,browserOptions);
	  wait=new WebDriverWait(driver,10);
  }
}
