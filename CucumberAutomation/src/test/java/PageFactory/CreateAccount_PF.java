package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount_PF 
{
WebDriver driver;
public CreateAccount_PF(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="(//input[@type='text'])[4]")
WebElement txt_accountname;
@FindBy(xpath="//*[@class='street compoundTLRadius compoundTRRadius compoundBorderBottom textarea' and @placeholder='Billing Street']")
WebElement txt_address;
@FindBy(xpath="//*[@type='button' and @title='Save']")
WebElement btn_save;



public void enterMandatoryFieldsOfAccount()
{
	//new Actions(driver).moveToElement(txt_accountname).click().perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	txt_accountname.sendKeys("Auto_"+java.time.LocalDateTime.now());
	txt_address.sendKeys("TestAddress");
}
private By By(WebElement txt_accountname2) {
	// TODO Auto-generated method stub
	return null;
}
public void saveAccount()
{
	btn_save.click();
}
}
