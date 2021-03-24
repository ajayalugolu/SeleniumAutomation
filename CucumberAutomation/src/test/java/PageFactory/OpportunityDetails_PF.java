package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityDetails_PF 
{
WebDriver driver;
public OpportunityDetails_PF(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="(//*[@class='tabHeader slds-path__link'])[1]")
WebElement lbl_opportunitydetails;

public boolean verifyLandingOnOpportunityDetailsPage()
{
	return lbl_opportunitydetails.isDisplayed();
	
}
}
