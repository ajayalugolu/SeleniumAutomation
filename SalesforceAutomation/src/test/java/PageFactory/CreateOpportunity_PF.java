package PageFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.it.Date.Dates;

public class CreateOpportunity_PF 
{
	WebDriver driver;
	AccountList_PF accountlist;
	DateFormat dateFormat;
	Date date;
	public CreateOpportunity_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement txt_opportunityname;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement txtsearch_accountname;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement txt_closeddate;
	@FindBy(xpath="(//*[@class='select'])[2]")
	WebElement drp_stage;
	@FindBy(xpath="//*[@href='javascript:void(0);' and @title='Proposal']")
	WebElement drpval_stage;
	@FindBy(xpath="//*[@type='button' and @title='Save']")
	WebElement btn_save;
	public void enterMandatoryFieldsOfopportunity()
	{
		dateFormat=new SimpleDateFormat("MM/dd/YYYY");
		date=new Date();
		String date1=dateFormat.format(date);
		accountlist=new AccountList_PF(driver);
		//new Actions(driver).moveToElement(txt_accountname).click().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		txt_opportunityname.sendKeys("Auto_opportunity"+java.time.LocalDateTime.now());
		txtsearch_accountname.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		txtsearch_accountname.sendKeys(Keys.ARROW_DOWN);
		txtsearch_accountname.sendKeys(Keys.ENTER);
		txt_closeddate.sendKeys(date1);
		drp_stage.click();
		drpval_stage.click();
	}
	public void saveOpportunity()
	{
		btn_save.click();
	}

}
