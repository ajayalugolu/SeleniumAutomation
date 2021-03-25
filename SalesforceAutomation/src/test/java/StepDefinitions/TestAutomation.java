package StepDefinitions;

import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;   
import java.time.format.DateTimeFormatter; 
import javax.sound.sampled.AudioSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.CreateAccount_POM;
import PageObjects.SFDCLogin_POM;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.*;
import io.cucumber.core.cli.Main;
import io.cucumber.junit.Cucumber;

public class TestAutomation 
{	 
//	WebDriver driver;
//	SFDCLogin_POM login;
//	CreateAccount_POM createact;
//	@Given("^login to salesforce with (.*)and (.*)$")
//	public void login_to_salesforce_with_userrname_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("C:\\Users\\Ajay\\Desktop", "chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://login.salesforce.com");
//		login=new SFDCLogin_POM(driver);
//		login.loginFunction(username, password);
//		//Set<Cookie> allcookies=driver.manage().getCookies();
//		//throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("home page should display")
//	public void home_page_should_display() throws InterruptedException 
//	{
//		
//		try 
//		{
//			login.loginCheck();
//	    	System.out.println("Login Successful");
//			Thread.sleep(2000);
//			driver.close();
//			driver.quit();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Login Unsuccessful");
//			driver.quit();
//		}
//		    
//		
//	}
//
//	@And("navigate to accounts module")
//	public void navigate_to_accounts_module() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		    createact=new CreateAccount_POM(driver);
//		    createact.clickAccounts();
//			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			//driver.findElement(By.xpath("//*[@data-id='Account']")).click();
//			//throw new io.cucumber.java.PendingException();
//		
//		
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user enter all mandatory fields and save it")
//	public void user_enter_all_mandatory_fields_and_save_it() {
//	    // Write code here that turns the phrase above into concrete actions
//	        createact =new CreateAccount_POM(driver);
//			
//			createact.clickNew();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			createact.accountData();
//			createact.saveAccount();
//			//driver.findElement(By.xpath("//*[@role='button' and @class='forceActionLink' and @title='New']")).click();
//			//driver.findElement(By.xpath("//input[@type='text' and @class='default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup']")).sendKeys("Auto_TestAccount_"+java.time.LocalDate.now());
//			//driver.findElement(By.xpath("//*[@class='street compoundTLRadius compoundTRRadius compoundBorderBottom textarea' and @placeholder='Billing Street']")).sendKeys("Test Address");
//			//driver.findElement(By.xpath("//*[@type='button' and @title='Save']")).click();
//			//throw new io.cucumber.java.PendingException();
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("account must get created")
//	public void account_must_get_created() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//			// Write code here that turns the phrase above into concrete actions
//			//WebElement element=driver.findElement(By.xpath("//*[@title='Details']"));
//		try
//		{
//			createact = new CreateAccount_POM(driver);
//			createact.accountDetails();
//		    System.out.println("Account succesfully created");
//			createact.logout();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Account not created");
//		}
//			
//		
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//
//
//

	
	
	
	
}