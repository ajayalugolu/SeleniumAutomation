package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {
	WebDriver driver;
	@FindBy(id="username")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="Login")
	WebElement btn_login;
	public Login_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginFunction(String username,String password)
	{
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}

}
