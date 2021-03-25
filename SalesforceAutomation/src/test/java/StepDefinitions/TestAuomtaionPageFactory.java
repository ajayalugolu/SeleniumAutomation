package StepDefinitions;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import ExcelReadWrite.ReadExcel;
import ExcelReadWrite.WriteExcel;
import PageFactory.AccountDetails_PF;
import PageFactory.AccountList_PF;
import PageFactory.CreateAccount_PF;
import PageFactory.CreateOpportunity_PF;
import PageFactory.Home_PF;
import PageFactory.Login_PF;
import PageFactory.OpportunityDetails_PF;
import PageFactory.OpportunityList_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAuomtaionPageFactory 
{
	WebDriver driver;
	ChromeOptions options;
	Login_PF loginf;
	Home_PF home;
	CreateAccount_PF createaccount;
	AccountList_PF accountlist;
	AccountDetails_PF accountdetails;
	CreateOpportunity_PF createopportunity;
	OpportunityList_PF opportunitylist;
	OpportunityDetails_PF opportunitydetails;
	@Given("^login to salesforce with (.*)and (.*)$")
	public void login_to_salesforce_with_userrname_and_password(String username, String password)
	{
		System.setProperty("C:\\Users\\Ajay\\Desktop", "chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com");
		loginf=new Login_PF(driver);
		loginf.loginFunction(username, password);
	}
	@Then("home page should display")
	public void home_page_should_display() 
	{
		//driver.switchTo().alert().dismiss();
	    home=new Home_PF(driver);
	   try
	   {
	    home.logincheck();
	   }
	   finally
	   {
		   driver.quit();
	   }
	   
	}
	@Given("navigate to accounts module")
	public void navigate_to_accounts_module() 
	{
		// Write code here that turns the phrase above into concrete actions
		home=new Home_PF(driver);
		home.accountsModuleNavigation();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enter all mandatory fields in account and save it")
	public void user_enter_all_mandatory_fields_in_account_and_save_it() 
	{
		//driver=new ChromeDriver(options);
		// Write code here that turns the phrase above into concrete actions
	//	try
	//	{
		createaccount=new CreateAccount_PF(driver);
		accountlist=new AccountList_PF(driver);
		accountlist.clickNewAccount();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.switchTo().frame(-1);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		createaccount.enterMandatoryFieldsOfAccount();
		createaccount.saveAccount();
	//	}
	//	finally
	//	{
		//driver.quit();
		//}
		// throw new io.cucumber.java.PendingException();
	}
	@Then("account must get created")
	public void account_must_get_created() throws Exception 
	{
		// Write code here that turns the phrase above into concrete actions
		home=new Home_PF(driver);
		accountdetails=new AccountDetails_PF(driver);
		try 
		{
		if(accountdetails.verifyLandingOnAccountDetailsPage())
		{
			Thread.sleep(2000);
			System.out.println("Account succesfully created");	
			home.optionsDropdown();
			home.logout();
			//driver.close();
			//driver.quit();
		}
		else
		{
			System.out.println("Account not created");
		}
		}
		finally
		{
			
			//home.optionsDropdown();
			//home.logout();
			//driver.close();
			driver.quit();
		}
		//throw new io.cucumber.java.PendingException();
	}

	@And("navigate to opportunities module")
	public void navigate_to_opportunities_module() 
	{
	    // Write code here that turns the phrase above into concrete actions
		home=new Home_PF(driver);
		//accountlist=new AccountList_PF(driver);
		//home.accountsModuleNavigation();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//accountlist.accountCreatedName();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		home.opportunitiesModuleNavigation();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enter all mandatory fields in opportunity and save it")
	public void user_enter_all_mandatory_fields_in_opportunity_and_save_it() 
	{
		opportunitylist=new OpportunityList_PF(driver);
	    // Write code here that turns the phrase above into concrete actions
		opportunitylist.clickNewOpportunity();
		createopportunity=new CreateOpportunity_PF(driver);
		createopportunity.enterMandatoryFieldsOfopportunity();
		createopportunity.saveOpportunity();
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("opportunity must get created")
	public void opportunity_must_get_created() throws InterruptedException 
	{
	    // Write code here that turns the phrase above into concrete actions
		opportunitydetails=new OpportunityDetails_PF(driver);
		try 
		{
		if(opportunitydetails.verifyLandingOnOpportunityDetailsPage())
		{
			Thread.sleep(2000);
			System.out.println("Opportunity succesfully created");	
			home.optionsDropdown();
			home.logout();
			//driver.close();
			//driver.quit();
		}
		else
		{
			System.out.println("Opportunity not created");
		}
		}
		finally
		{
			
			//home.optionsDropdown();
			//home.logout();
			//driver.close();
			driver.quit();
		}

	    //throw new io.cucumber.java.PendingException();
	}
	@When("I hit delete option")
	public void i_hit_delete_option() 
	{
	    // Write code here that turns the phrase above into concrete actions
		accountlist=new AccountList_PF(driver);
		accountlist.deleteAccount();
		
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("the account should be deleted")
	public void the_account_should_be_deleted() 
	{
	    // Write code here that turns the phrase above into concrete actions
		accountlist=new AccountList_PF(driver);
		accountlist.deleteAccountSuccessful();
		driver.quit();
	   // throw new io.cucumber.java.PendingException();
	}

}
