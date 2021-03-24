package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jdk.jfr.Timespan;

public class Home_PF {
	WebDriver driver;
public Home_PF(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//*[@title='Sales']")
WebElement lbl_sales;

@FindBy(xpath="//*[@data-id='Account']")
WebElement lnkbtn_accounts;
@FindBy(xpath="//*[@data-id='Opportunity']")
WebElement lnkbtn_opportunities;
@FindBy(xpath="//*[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']")
WebElement img_options;
@FindBy(xpath="//*[@class='profile-link-label logout uiOutputURL']")
WebElement lnkbtn_logout;
public void logincheck()
{   
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(lbl_sales.isDisplayed()&lbl_sales.isEnabled())
	{
	  System.out.println("Login Successful");
	  img_options.click();
	  lnkbtn_logout.click();
	  driver.quit();
	}
	else
	{
		System.out.println("Login Unsuccessful");
		driver.quit();
	}
}
public void accountsModuleNavigation()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	lnkbtn_accounts.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void opportunitiesModuleNavigation()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	lnkbtn_opportunities.click();
}
public void optionsDropdown()
{
	img_options.click();
}
public void logout()
{
	lnkbtn_logout.click();
}
}
