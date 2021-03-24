package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetails_PF 
{
 WebDriver driver;
 public AccountDetails_PF(WebDriver driver)
 {
	this.driver=driver;
	PageFactory.initElements(driver,this);
 }
 @FindBy(xpath="//*[@title='Details']")
 WebElement lbl_accountdetails;
 @FindBy(xpath="//*[@class='custom-truncate uiOutputText']")
 WebElement lbl_accountname;
 
 public boolean verifyLandingOnAccountDetailsPage()
 {
 	return lbl_accountdetails.isDisplayed();
 	
 }
 public String readaccountname()
 {
	 return lbl_accountname.getText();
 }
}
