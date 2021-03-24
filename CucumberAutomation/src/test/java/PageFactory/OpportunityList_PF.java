package PageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityList_PF 
{
	WebDriver driver;
	Home_PF home;
	AccountList_PF accountlist;
	String accounttobeentered;
	public OpportunityList_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//*[@title='New'])[2]")
	WebElement btn_new;
	
	public void clickNewOpportunity() 
	{
		
		btn_new.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
