package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountList_PF 
{
	String count2;
	String countofAccount;
	WebDriver driver;
	public AccountList_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@title='New' and @class='forceActionLink']")
	@CacheLookup
	WebElement btn_new;
	@FindBy(xpath="//*[@href='/lightning/r/0015g000008l0IjAAI/view'][1]")
	WebElement lnk_createdaccount;
	@FindBy(xpath="(//*[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]")
	WebElement lnkdrp_accountmodify;
	@FindBy(xpath="(//*[@class='countSortedByFilteredBy'])")
	WebElement lbl_accountcount;
	@FindBy(xpath="//*[@href='javascript:void(0);' and @title='Delete']")
	WebElement lnk_deleteaccount;
	@FindBy(xpath="//*[@title='Delete' and @type='button']")
	WebElement btn_confirmdeleteaccount;
	@FindBy(xpath="//*[class='slds-theme--success slsds-notify--toast slds-notify slds-notify--toast forceToastMessage' and @role='alert']")
	WebElement lbl_deletemessage;
	public void clickNewAccount() 
	{
		btn_new.click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public String accountCreatedName()
	{
		return lnk_createdaccount.getText();
	}
	public void navigateToCreatedAccount()
	{
		lnk_createdaccount.click();
	}
	public void deleteAccount()
	{
	   // count2=count.replaceAll("[^0-9]",count);
		lnkdrp_accountmodify.click();
		lnk_deleteaccount.click();
		btn_confirmdeleteaccount.click();  
	}
	public void deleteAccountSuccessful() 
	{
	 lbl_deletemessage.isDisplayed();
	 System.out.println("Account Succesfully deleted");
	}
	
}
